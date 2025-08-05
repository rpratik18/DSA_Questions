import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Q16 {
    // Helper to validate IPv4 address
    public static boolean isValidIP(String ip) {
        String zeroTo255 = "(25[0-5]|2[0-4][0-9]|[01]?\\d\\d?)";
        String ipRegex = "^(" + zeroTo255 + "\\.){3}" + zeroTo255 + "$";
        return ip.matches(ipRegex);
    }

    // Main logic
    public static String getMaxIP(String[] logs) {
        Map<String, Integer> freqMap = new HashMap<>();
        Pattern ipPattern = Pattern.compile("\\b(?:\\d{1,3}\\.){3}\\d{1,3}\\b");

        for (String line : logs) {
            Matcher matcher = ipPattern.matcher(line);
            if (matcher.find()) {
                String ip = matcher.group();
                if (isValidIP(ip)) {
                    freqMap.put(ip, freqMap.getOrDefault(ip, 0) + 1);
                }
            }
        }

        String maxIP = null;
        int maxCount = 0;

        for (Map.Entry<String, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                maxIP = entry.getKey();
            }
        }

        return maxIP;
    }

    public static void main(String[] args) {
        String[] logs = {
                "10.0.0.1 bytes=32 time=50ms TTL=63",
                "10.0.0.2 bytes=32 time=50ms TTL=73",
                "10.0.0.4 bytes=32 time=50ms TTL=83",
                "10.0.0.2 bytes=32 time=50ms TTL=93"
        };

        System.out.println("Most frequent IP: " + getMaxIP(logs)); // Output: 10.0.0.2
    }
}
