package com.cydeo.java9;

public class CompactStringDemo {
    public static void main(String[] args) {

        String abc = "cydeo";
       // private final byte[] value;//holding byte arrary
       //in the past before java9 this was char
//they added byte coder
        //    private final byte coder;
        /*
        public char charAt(int index) {
            if (isLatin1()) {if it is true
                return StringLatin1.charAt(value, index);
            } else {
                return StringUTF16.charAt(value, index);
            }
        }
          boolean isLatin1() {
        return COMPACT_STRINGS && coder == LATIN1;
    }
    static final boolean COMPACT_STRINGS;
    static {
        COMPACT_STRINGS = true;
    }
         */
    }
}
