public class 前缀树208 {
}
class Trie208 {
    private boolean isEnd;
    private Trie208[] children;
    public Trie208() {
        children=new Trie208[26];
        isEnd=false;
    }

    public void insert(String word) {
        Trie208 node=this;
        for(int i=0;i<word.length();i++){
            int index=word.charAt(i)-'a';
            if(node.children[index]==null){
                node.children[index]=new Trie208();
            }
            node=node.children[index];
        }
        node.isEnd=true;
    }

    public boolean search(String word) {
        Trie208 node = this;
        for (int i = 0; i < word.length(); i++) {
            int index = word.charAt(i) - 'a';
            if (node.children[index] == null)
                return false;
            node = node.children[index];
        }
        return node!=null&&node.isEnd==true;
    }

    public boolean startsWith(String prefix) {
        Trie208 node = this;
        for (int i = 0; i < prefix.length(); i++) {
            int index = prefix.charAt(i) - 'a';
            if (node.children[index] == null)
                return false;
            node = node.children[index];
        }
        return node!=null;
    }
}

