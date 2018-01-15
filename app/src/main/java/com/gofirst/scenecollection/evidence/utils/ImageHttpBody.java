package com.gofirst.scenecollection.evidence.utils;


import com.gofirst.scenecollection.evidence.model.UpLoadData;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/**
 * Created by Administrator on 2016/3/16.
 */
public class ImageHttpBody implements UpLoadRequest.OnWriteHttpBody {


    @Override
    public void writeHttpBody(StringBuffer sb, ByteArrayOutputStream bos, UpLoadData uploadData, String BOUNDARY) {

        sb.append("--" + BOUNDARY);
        sb.append("\r\n");
        sb.append("Content-Disposition: form-data;");
        sb.append(" name=\"");
        sb.append(uploadData.getKey());
        sb.append("\"");
        sb.append("; filename=\"");
        sb.append(uploadData.getFileName());
        sb.append("\"");
        sb.append("\r\n");
        sb.append("Content-Type: ");
        sb.append(uploadData.getMime());
        sb.append("\r\n");
        sb.append("\r\n");
        try {
            bos.write(sb.toString().getBytes("utf-8"));
            bos.write(uploadData.getBytevalue());
            bos.write("\r\n".getBytes("utf-8"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
