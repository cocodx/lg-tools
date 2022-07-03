package io.github.cocodex.file;

/**
 * @author amazfit
 * @date 2022-07-03 下午3:16
 **/
public class FileUtils {

    /**
     * 根据传的size来算大小,
     * 1 Byte = 8 Bits（即1B=8b）
     * 1 KB = 1024 Bytes
     * 1 MB = 1024 KB
     * 1 GB = 1024 MB
     * @param fileSize B KB MB GB TB
     * @return 默认MB
     */
    public static String getFileSizeMB(String fileSize){
        Integer index = null;
        fileSize = fileSize.trim();
        for (int i = 0; i < fileSize.length(); i++) {
            char c = fileSize.charAt(i);
            if (c>='0' && c<='9'){
                continue;
            }else {
                index = i;
                break;
            }
        }
        //当成B来算
        if (index==null){
            int strMB = Integer.parseInt(fileSize)/1024/1024;
            return strMB+"MB";
        }

        return null;
    }

    public static void main(String[] args) {
        System.out.println(getFileSizeMB("1048576"));
    }
}
