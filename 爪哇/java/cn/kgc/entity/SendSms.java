package cn.kgc.entity;

import com.aliyuncs.CommonRequest;
import com.aliyuncs.CommonResponse;
import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.exceptions.ServerException;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.profile.DefaultProfile;

import java.util.Random;

/*
pom.xml
<dependency>
  <groupId>com.aliyun</groupId>
  <artifactId>aliyun-java-sdk-core</artifactId>
  <version>4.5.3</version>
</dependency>
*/
public class SendSms {
    public static void main(String[] args) {
        DefaultProfile profile = DefaultProfile.getProfile("50AFD673-5C3A-48FD-8C2D-CA7D58E30F25", "LTAI4GEM98sKjovdxWNm7TZF", "aSedK4E7vC1AXQBqmNnPfTAwWTL3M6");
        IAcsClient client = new DefaultAcsClient(profile);
        String Code = String.valueOf(new Random().nextInt(8999) + 10000);
        System.out.println(Code);

        CommonRequest request = new CommonRequest();
        request.setSysMethod(MethodType.POST);
        request.setSysDomain("dysmsapi.aliyuncs.com");
        request.setSysVersion("2017-05-25");
        request.setSysAction("SendSms");
        request.putQueryParameter("RegionId", "50AFD673-5C3A-48FD-8C2D-CA7D58E30F25");
        request.putQueryParameter("PhoneNumbers", "13770927726");
        request.putQueryParameter("SignName", "猛男手机商城");
        request.putQueryParameter("TemplateCode", "SMS_206548342");
        request.putQueryParameter("TemplateParam", "{\"code\":\""+Code+"\"}");


        try {
            CommonResponse response = client.getCommonResponse(request);
            System.out.println(response.getData());
        } catch (ServerException e) {
            e.printStackTrace();
        } catch (ClientException e) {
            e.printStackTrace();
        }
    }
}

