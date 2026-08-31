class Solution {

    public String encode(List<String> strs) {
        //String encoded_string = null;
        StringBuilder sb = new StringBuilder();

        for (String woord: strs){
            // encoded_string = deze is niet nodig
            sb.append(woord.length()).append("#").append(woord).toString();
            //System.out.println(encoded_string);
        }

        return sb.toString();

    }

    public List<String> decode(String str) {
        List<String> decoded_strs = new ArrayList<>();
        int i = 0;
//5#Hello6#Worlds
        while(i < str.length()){
            int delimiter = str.indexOf('#', i);// 1 // i = 7 delimiter = 8
            int length = Integer.parseInt(str.substring(i, delimiter));
            i = delimiter + 1; // 2 // 9
            String string = str.substring(i, i + length);//2-7 Hello / 9 ,9+6= 15
            decoded_strs.add(string);
            i += length; //2 + 5 = 7 / 9 + 6 = 15
        }

        return decoded_strs;
    
    }
}
