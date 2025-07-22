public class Q2 {

    public static void main(String[] args) {
        String[] dict = {"CODGE", "ODG", "LODGES", "SODG", "dodge", "mODJ", "LODGESSSS"};
        String toSearch = "ODG";
        int temp=0,size=0;
        String word="";
        for(int i=0;i< dict.length;i++){
            if(dict[i].contains(toSearch)){
                if(size<dict[i].length()) {
                    word =dict[i];
                    size = dict[i].length();
                }
            }

        }
        System.out.println(word+"   "+size);
    }
}
