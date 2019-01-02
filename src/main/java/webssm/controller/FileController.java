package webssm.controller;

import org.apache.commons.io.FileUtils;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.multipart.support.MultipartFilter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.UUID;

@Controller
@RequestMapping("/file")
public class FileController {
    String path = "E:\\shylock\\";

    @RequestMapping("/showFileUp")
    public String showFileUp(){
        return "file/fileUp";
    }

    @RequestMapping("/showFileDownload")
    public String showFileDownload(Model model){

        File file = new File(path);
        String[] files = file.list();
        model.addAttribute("files",files);
        return "file/fileDownload";
    }

    @RequestMapping("/success")
    public String suceess(){
        return "file/success";
    }


    @RequestMapping("/fileUp")
    public String doFileIp(@RequestParam("file") CommonsMultipartFile file) throws Exception {
        String oldName = file.getOriginalFilename();
        System.out.println("-----------------"+oldName);


        int index = 0;
        if( (index = oldName.lastIndexOf("/")) != -1){
            oldName = oldName.substring(index+1);
        }
        String extName = oldName.substring(oldName.lastIndexOf("."));
        //文件重命名
        String uuid = UUID.randomUUID().toString();
        uuid = uuid.replaceAll("-","");
        String fileName = uuid+extName;
        System.out.println(fileName);

        //保存问文案件
        OutputStream os = null;
        File file1 = new File("C:\\",fileName);
     //   os = new FileOutputStream("C:\\"  + fileName);
        InputStream is = file.getInputStream();
//        byte[] tempbytes = new byte[100];
//        int len;
//        while ((len = is.read(tempbytes)) != -1) {
//            os.write(tempbytes, 0, len);
//        }
        //第二种实现复制方法
        FileUtils.copyInputStreamToFile(is,file1);

        return "forward:/file/success";
    }

//    @RequestMapping("/fileDownload")
//    public void fileDownload(String fileName, HttpServletResponse response) throws Exception {
//       String fn = new String(fileName.getBytes("utf-8"),"iso-8859-1");
//        System.out.println("----------------------------------------"+fileName);
//        //下载实现:
//        //一个头:响应头
//        response.setHeader("Content-Disposition","attachment;filename="+fn);
//        response.setContentType("application/octet-stream");
//
//        //两个流 输入流 输出流
//        //读取服务器端的输入流
//        File file = new File(path,fileName);
//        InputStream is = new BufferedInputStream(new FileInputStream(file));
//
//        //写出流 将读取到的文件写出到客户端
//        OutputStream os = response.getOutputStream();
//        //实现边度编写
//        byte[] bs = new byte[1024];
//        int len = -1;
//        while((len=is.read(bs))!=-1){
//            os.write(bs,0,len);
//        }
//
//        is.close();
//        os.close();
//
//    }

    @RequestMapping("/fileDownload2")
    public ResponseEntity<byte[]> fileDownload2(String fileName, HttpServletResponse response) throws Exception {
        System.out.println(fileName);
        String fn = new String(fileName.getBytes("utf-8"),"iso-8859-1");
        File file = new File(path,fileName);
        //准备响应头
        HttpHeaders headers = new HttpHeaders();
        headers.setContentDispositionFormData("attachment",fn);
        headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
        //设置响应工具类  需要file输入流 头 响应码
        ResponseEntity<byte[]> re = new ResponseEntity<>(FileUtils.readFileToByteArray(file),headers, HttpStatus.OK);
        return re;
    }





}
