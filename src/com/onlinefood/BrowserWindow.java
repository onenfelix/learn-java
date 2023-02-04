package com.onlinefood;

public class BrowserWindow {
        public void navigate(String address) {
            String ip = findIpAddress(address);
            String html = sendHttpRequest(ip);
            System.out.println(html);
        }

        private String sendHttpRequest(String ip) {
            return "<html></html> ";
        }

        private String findIpAddress(String address) {
            return "127.0.0.2";
        }
}
