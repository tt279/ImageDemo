package com.test;

import org.fit.cssbox.demo.ImageRenderer;
import org.xml.sax.SAXException;

import java.io.*;

public class ImageTest {

    public static void main(String[] args) throws  Exception{

        ImageRenderer renderer = new ImageRenderer();

        String name = "hehe";

/*        String html= "<!DOCTYPE html PUBLIC '-//W3C//DTD XHTML 1.0 Transitional//EN' 'http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd'>"
                +" <html xmlns='http://www.w3.org/1999/xhtml'>"
                +"<style>.p1 {font-size:36px;font-weight:200;color:#0000FF;}</style>"
                +"<style>.p2 { font-size:24px;font-weight:300;color: #FF0000;}</style>"
                +"<head><meta http-equiv='Content-Type' content='text/html; charset=utf-8' /><title>CSS</title></head>"
                +"<body><p class='p1'>CSS测试乱码</p><p class='p2'>CSS有码</p><p class='p3'>CSS无码</p><p class='p4'>CSS呵呵呵呵</p></body></html>";*/

        String html = "<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"utf-8\">\n" +
                "    <meta name=\"keywords\" content=\"\">\n" +
                "    <meta name=\"description\" content=\"\">\n" +
                "    <meta name=\"viewport\" content=\"width=device-width,initial-scale=1.0,maximum-scale=1.0,user-scalable=no\">\n" +
                "    <meta name=\"format-detection\" content=\"telephone=no\">\n" +
                "    <meta content=\"yes\" name=\"apple-mobile-web-app-capable\">\n" +
                "    <meta content=\"black\" name=\"apple-mobile-web-app-status-bar-style\">\n" +
                "    <title>普惠家获得AA级企业信用评级证书</title>\n" +
                "    <link rel=\"stylesheet\" type=\"text/css\" href=\"../../css/promotion/WX_certification.css\">\n" +
                "    <script type=\"text/javascript\" src=\"https://res.wx.qq.com/open/js/jweixin-1.0.0.js\"></script>\n" +
                "    <script type=\"text/javascript\" src=\"../../js/jquery-1.9.1.min.js\"></script>\n" +
                "    <script src=\"../../js/angular.min.js\"></script>\n" +
                "    <script type=\"text/javascript\" src=\"../../js/common.js\"></script>\n" +
                "\n" +
                "</head>\n" +
                "<body>\n" +
                "<div class=\"WX_certification_1\"></div>\n" +
                "<div class=\"WX_certification_2\">\n" +
                "    <p>普惠家通过商务部</p>\n" +
                "    <div class=\"c_2_img\">\n" +
                "        <img src=\"../../images/promotion/WX_certification/WX_certification_04.jpg\"/>\n" +
                "    </div>\n" +
                "    <div class=\"c_2_a\">\n" +
                "        <a href=\"http://www.itrust.org.cn/home/index/itrust_certifi/wm/PJ2017010902\">查看电子证书 <br />" +
                " </a>\n" +
                "    </div>\n" +
                "</div>\n" +
                "<div class=\"WX_certification_3\">\n" +
                "    <span style=\"display: inline-block; vertical-align: top; margin-top: 1.3rem;\" class=\"c_3_s1\"></span><!--\n" +
                "    --><p style=\"display: inline-block; width: 16.75rem; padding: 1rem 0.5rem 0 0.2rem;\" class=\"w_c_p1\">\n" +
                "        AA级企业信用评级认证由中国互联网协会信用评价中心颁发。\n" +
                "    </p>\n" +
                "    <span style=\"display: inline-block; vertical-align: top; margin-top: 0.3rem;\" class=\"c_3_s1\"></span><!--\n" +
                "    --><p style=\"display: inline-block; width: 16.75rem; padding: 0 0.5rem 0 0.2rem;\">\n" +
                "        政府部门、互联网金融行业专家\n <br/> 手动换行"  +
                "    </p>\n" +
                "    <span style=\"display: inline-block; vertical-align: top; margin-top: 0.3rem;\" class=\"c_3_s1\"></span><!--\n" +
                "    --><p style=\"display: inline-block; width: 16.75rem; padding: 0 0.5rem 0 0.2rem;\">\n" +
                "        AA级企业信用认证是普惠家企业信誉\n" +
                "    </p>\n" +
                "</div>\n" +
                "</body>\n" +
                "</html>\n";



        //String url = "http://maven.apache.org/";

        //String outHtmlUrl = "C:/Users/D/Desktop/" + name +".html";

        String outHtmlUrl = "C:/workspace222/phj-web-mobile/src/main/webapp/p_promotion/WX_certification/" + name +".html";


        File dest = new File(outHtmlUrl);
        //字节输出流
        FileOutputStream fileOutputStream = new FileOutputStream(dest);
        fileOutputStream.write(html.getBytes());
        fileOutputStream.close();

        String url = "file:///" + outHtmlUrl;
        System.out.println(url);

        try {
            System.out.println("start");
            FileOutputStream out = new FileOutputStream(new File("D:" + File.separator + "html3.png"));
            renderer.renderURL(url, out, ImageRenderer.Type.PNG);

            System.out.println("end");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        }

    }

}
