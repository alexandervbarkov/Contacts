package utils

class FileUtils {
    static String readFileAsString(String fileName) {
        return new File(fileName).text
    }
}
