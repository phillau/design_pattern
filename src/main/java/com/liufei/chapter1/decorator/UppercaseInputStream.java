package com.liufei.chapter1.decorator;

import java.io.*;

public class UppercaseInputStream extends FilterInputStream {
    /**
     * Creates a <code>FilterInputStream</code>
     * by assigning the  argument <code>in</code>
     * to the field <code>this.in</code> so as
     * to remember it for later use.
     *
     * @param in the underlying input stream, or <code>null</code> if
     *           this instance is to be created without an underlying stream.
     */
    protected UppercaseInputStream(InputStream in) {
        super(in);
    }

    @Override
    public int read() throws IOException {
        int read = super.read();
        return read == -1 ? read : Character.toUpperCase((char) read);
    }

    public static void main(String[] args) throws IOException {
        int r;
        FileInputStream fileInputStream = new FileInputStream("F:\\a.txt");
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
        UppercaseInputStream uppercaseInputStream = new UppercaseInputStream(bufferedInputStream);
        while ((r = uppercaseInputStream.read()) > 0) {
            System.out.println((char) r);
        }
        uppercaseInputStream.close();
    }
}
