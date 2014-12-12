package com.github.knightliao.apollo.utils.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

import org.apache.commons.codec.binary.Hex;
import org.apache.commons.codec.digest.DigestUtils;

/**
 * 文件操作的方法集
 * 
 * @author liaoqiqi
 * @version 2014-8-20
 */
public final class FileUtils extends org.apache.commons.io.FileUtils {

    private FileUtils() {

    }

    /**
     * 关闭文件流
     * 
     * @param w 上午10:27:27 created by Darwin(Tianxin)
     */
    public final static void closeWriter(Writer w) {
        if (w != null)
            try {
                w.close();
            } catch (Exception e) {
            }
    }

    /**
     * 关闭文件流
     * 
     * @param r 上午10:27:27 created by Darwin(Tianxin)
     */
    public final static void closeReader(Reader r) {
        if (r != null)
            try {
                r.close();
            } catch (Exception e) {
            }
    }

    /**
     * 关闭文件流
     * 
     * @param os 上午10:27:27 created by Darwin(Tianxin)
     */
    public final static void closeOutputStream(OutputStream os) {
        if (os != null)
            try {
                os.close();
            } catch (Exception e) {
            }
    }

    /**
     * 关闭文件流
     * 
     * @param is 上午10:27:27 created by Darwin(Tianxin)
     */
    public final static void closeInputStream(InputStream is) {
        if (is != null)
            try {
                is.close();
            } catch (Exception e) {
            }
    }

    /**
     * 使用jar包：commons-codec-1.4.jar的md5比较方法 <br/>
     * http://blog.csdn.net/very365_1208/article/details/8824033
     * 
     * @param oldName
     * @param newName
     * @return
     */
    public static boolean isFileUpdate(String oldName, String newName) {

        return isFileUpdate(new File(oldName), new File(newName));
    }

    /**
     * 使用jar包：commons-codec-1.4.jar的md5比较方法 <br/>
     * http://blog.csdn.net/very365_1208/article/details/8824033
     * 
     * @param oldName
     * @param newName
     * @return
     */
    public static boolean isFileUpdate(File oldFile, File newFile) {

        String oldFileMd5 = null;
        String newFileMd5 = null;

        try {

            oldFileMd5 = new String(Hex.encodeHex(DigestUtils.md5(new FileInputStream(oldFile))));
            newFileMd5 = new String(Hex.encodeHex(DigestUtils.md5(new FileInputStream(newFile))));

        } catch (FileNotFoundException e) {

            e.printStackTrace();

        } catch (IOException e) {

            e.printStackTrace();
        }

        if (oldFileMd5 == null || newFileMd5 == null) {
            return false;
        }

        return (!oldFileMd5.equals(newFileMd5));
    }
}
