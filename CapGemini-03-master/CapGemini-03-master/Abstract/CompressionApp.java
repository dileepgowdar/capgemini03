package com.tns.Abstract;

abstract class FileCompression{
	abstract void compress(String compress);
	
	void ShowDetails() {
		System.out.println("compress started");
	}
}

class ZipFileCompressor extends FileCompression{

	@Override
	void compress(String compress) {
		// TODO Auto-generated method stub
		System.out.println("compressing using zip");
		int originalsize=100;
		int compressedsize=originalsize*50/100;
		System.out.println("original size:"+originalsize);
		System.out.println("compressed size:"+compressedsize);
	}
	
}

class GzipFileCompressor extends FileCompression{

	@Override
	void compress(String FileName) {
		// TODO Auto-generated method stub
		System.out.println("compressing using zip");
		int originalsize=100;
		int compressedsize=originalsize*50/100;
		System.out.println("original size:"+originalsize+"MB");
		System.out.println("compressed size:"+compressedsize+"MB");
	}
	
}



public class CompressionApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
