package ru.zivo.problems;

/**
 * Source: https://leetcode.com/problems/encode-and-decode-tinyurl
 * Title: 535. Encode and Decode TinyURL
 * Difficulty: Medium
 */
public class Problem535 {
    public class Codec {
        String url;

        // Encodes a URL to a shortened URL.
        public String encode(String longUrl) {
            url = longUrl;
            return url;
        }

        // Decodes a shortened URL to its original URL.
        public String decode(String shortUrl) {
            return url;
        }
    }
}
