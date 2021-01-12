package cn.kgc.util;

import java.io.FileWriter;
import java.io.IOException;

/* *
 *类名：AlipayConfig
 *功能：基础配置类
 *详细：设置帐户有关信息及返回路径
 *修改日期：2020-05-05
 *说明：
 *以下代码只是为了方便商户测试而提供的样例代码，商户可以根据自己网站的需要，按照技术文档编写,并非一定要使用该代码。
 *该代码仅供学习和研究支付宝接口使用，只是提供一个参考。
 */

public class AlipayConfig {
	
//↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

	// 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
	public static String app_id = "2016110300790250";
	
	// 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQC7VT1Oyk5megkbmICMu/yZTmWp2qelBQWCiAleDljy9Palw/rGY0sSjFBG/F+qbjVI6q0WKiBi4T5o3JQUwdPOjdeuu8vK/9ZDMgFgU4EbPQb/C+81dcfpmbuv9RJXn7JGV9Ehi9ghCDTdEuklA4VhEgIzRo3VSh61qTMqWyZAcT2NGNmxwv1QeU4udiZg4nFK1P/i9WPNi0Yen0i0zpmJ2RkN+3MT9ALV0R2zxTBXMc18lD04337aXolLp6huBJT9obH1B5K1ZbSbUTTn3+DCyd/Enn1BMQngNmE8thwkpgZLhC0++2SGZS5uMvNDPBJF7BLbucHQRChORYVnzg23AgMBAAECggEATqKrR4WYf1++rvzHCUxn7hqAhloogRaoh3B/LiIrqGC3oEGx5NENVE3d7M5Hgg0dBOytl147lgYi4nWlG0l5lXzpCon+M8pMsIwvE7Y5vatSYoEp+nDkZ+SGaogfGPUKKoj2WnSPVt5RAnPLtiPSOzsJ/WgiZWPlnC/YMHFujyHBsKQTDYxfdhwx04IIXfEaFjjwv5YNnfUx7j2OyGoZF27j+y31ulLZgh01ATQb3gqZQn29FLbd0xX8HlMK+dSQZlc5MQgGBwbmXULmtj/BhURQ6MDmkCPTFaUbScoGdDZpYjh/qDSig7unTRrn2uu5x5mSvf9yc3b/EcMoTgOdEQKBgQDmtEjS4LJ81dTrd6E5Ncuek8WArOyUCt3RM5CRWYvqsA8CGn+Y6mRM+8bDEdaZZ+jUNW1QHCPNBqEcuT0yNyiEonopkZg3EscrqxviEVqi9lLxc2ZLAOWZzflfM2O0t87o6MbyPf3F4UcDHteu6I5ctPUt4XF+aJfhC2nxZ4LLbQKBgQDP341YQ4LqWttmyvh5tA40rFlzG9c4NSYY0MhuFWdVXxWjioQWrxyLY96zKcjyhSPLbYnBvlFmW7d50gTU05v2y09wo0xNhJvql0VsNpaW4ct2W1PI5p8MJsiVum87Fy64899A1190BXx2rd0EUF8pnV2bj0PPnWjFETgOwEpDMwKBgQDLnb7QcATYbRnZIOKozbQDJ8UfBoBfQR/5bhtgTbpRzkXQw3ZujiEsWONac7oF91HlSapLFCr836b+5PcABPK77XMIkTnZEbe78O9RHaPzRJh8Bi/4brg2gTZhMcgETl5N7nT4hIIgTe4Q8P3Hn/VWGVhzwBAdU08JDrvYllU4GQKBgHBBOfQjKQxjmj3NeBdI6674L6ngq/2XfgZCoSoJdu78VRQm1iPl1pVTjkzUUMberTDK62xr2UtcVh18E83WpE/HBRQ/qxHlfclWfU/tvq6mKpi0wu8n01Xdj86DilOvtjR8xeAfLlXaLJduVn9g47L2XzmFSUpRp+Vb4hjdMH1PAoGBANFeNJr3UctGDCUtVTUtvwHtz47kg4uCA7ngOfCMUT8QcMb28uq6o2cQ3fzjxd2z3w0+PEsui3EXEI3s0uTq00jPuEs4/RqM1dxZpw2eFXM12eeyHjCkQhN5icg11bz+3XCTHD9yqiPA3tUi2JdUH5LjyaqQn40753D2MnVwbxhF";
	
	// 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDIgHnOn7LLILlKETd6BFRJ0GqgS2Y3mn1wMQmyh9zEyWlz5p1zrahRahbXAfCfSqshSNfqOmAQzSHRVjCqjsAw1jyqrXaPdKBmr90DIpIxmIyKXv4GGAkPyJ/6FTFY99uhpiq0qadD/uSzQsefWo0aTvP/65zi3eof7TcZ32oWpwIDAQAB";

	// 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String notify_url = "http://localhost:8088/order/notify_url";

	// 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String return_url = "http://localhost:8088/order/return_url";

	// 签名方式
	public static String sign_type = "RSA2";
	
	// 字符编码格式
	public static String charset = "utf-8";
	
	// 支付宝网关
	public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";
	
	// 支付宝网关
	public static String log_path = "C:\\";


//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    /** 
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     * @param sWord 要写入日志里的文本内容
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis()+".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

