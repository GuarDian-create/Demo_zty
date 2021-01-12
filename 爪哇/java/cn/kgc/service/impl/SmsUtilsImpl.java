package cn.kgc.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.aliyuncs.CommonRequest;
import com.aliyuncs.CommonResponse;
import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.profile.DefaultProfile;
import com.aliyuncs.profile.IClientProfile;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

import java.util.Random;

/**
 * "RequestId": "50AFD673-5C3A-48FD-8C2D-CA7D58E30F25",
 * 	"Message": "OK",
 * 	"BizId": "763522807486769365^0",
 * 	"Code": "OK"
 */
@Configuration
public class SmsUtilsImpl {
    public String sendSms(String telephone)  {

        Logger logger = LoggerFactory.getLogger(SmsUtilsImpl.class);
        IClientProfile profile = DefaultProfile.getProfile("50AFD673-5C3A-48FD-8C2D-CA7D58E30F25", "LTAI4GEM98sKjovdxWNm7TZF", "aSedK4E7vC1AXQBqmNnPfTAwWTL3M6");
        IAcsClient client = new DefaultAcsClient(profile);
        String Code = String.valueOf(new Random().nextInt(8999) + 10000);

        CommonRequest request = new CommonRequest();
        // 请求类型：必填 固定值
        request.setMethod(MethodType.POST);
        // 产品域名：必填 固定值
        request.setSysDomain("dysmsapi.aliyuncs.com");
        // 版本：必填 固定值
        request.setSysVersion("2017-05-25");
        // 动作：必填 固定值
        request.setSysAction("SendSms");
        // 必填 固定值
        request.putQueryParameter("RegionId", "50AFD673-5C3A-48FD-8C2D-CA7D58E30F25");
        // 待发送手机号
        request.putQueryParameter("PhoneNumbers", telephone);
        // 短信签名-可在短信控制台中找到
        request.putQueryParameter("SignName", "猛男手机商城");
        // 短信模板-可在短信控制台中找到
        request.putQueryParameter("TemplateCode", "SMS_206548342");
        // 模板中的变量替换JSON串,如模板内容为"尊敬的用户,您的验证码为${code}"时,此处的值为
        request.putQueryParameter("TemplateParam", "{\"code\":\""+Code+"\"}");

        CommonResponse response = null;
        try {
            response = client.getCommonResponse(request);
        } catch (ClientException e) {
            e.printStackTrace();
        }
        logger.info(JSONObject.toJSONString(response));
        JSONObject jsonObject = JSONObject.parseObject(response.getData());
        // jsonObject = {"RequestId":"22","Message":"OK","BizId":"22^0","Code":"OK"}
        if (jsonObject.getString("Code") != null && "OK".equals(jsonObject.getString("Code"))) {
            logger.info("短信发送成功！");
            return Code;
        } else {
            logger.info("短信发送失败！");
        }
        return null;
    }

}
