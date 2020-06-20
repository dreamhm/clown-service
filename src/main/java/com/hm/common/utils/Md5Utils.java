package com.hm.common.utils;

import java.security.MessageDigest;
import java.util.UUID;

public class Md5Utils {

	/**
	 * 对密码加密
	 * @param s 密码
	 * @return
	 */
	public static String md5(String s) {
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			byte[] bytes = md.digest(s.getBytes("utf-8"));
			return toHex(bytes);
		} catch (Exception e) {
			throw new RuntimeException();
		}
	}
	
	private static String toHex(byte[] bytes) {
		final char[] HEX_DIGITS = "0123456789ABCDEF".toCharArray();
		StringBuilder ret = new StringBuilder(bytes.length * 2);
		for (int i = 0; i < bytes.length; i++) {
			ret.append(HEX_DIGITS[(bytes[i] >> 4) & 0x0f]);
			ret.append(HEX_DIGITS[bytes[i] & 0x0f]);
		}
		return ret.toString();
	}
	
	/**
	 * 生成salt
	 * @return
	 */
	public static String salt() {
		UUID uuid = UUID.randomUUID();
		String[] arr = uuid.toString().split("-");
		return arr[0];
	}
	
	/**
	 * 生成随机昵称
	 * @return
	 */
	public static String nickname() {
		UUID uuid = UUID.randomUUID();
		String[] arr = uuid.toString().split("-");
		return arr[0];
	}
	
	public static void main(String[] args) {
		String salt = Md5Utils.nickname();
		System.out.println(salt);
	}
}
