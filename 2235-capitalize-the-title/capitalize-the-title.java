class Solution {
    public String capitalizeTitle(String title) {
        //nvvv2323
        String[] words = title.split(" ");
        List<String> result = new ArrayList<>();

        for (String word : words) {
            if (word.length() <= 2) {
                result.add(word.toLowerCase());
            } else {
                result.add(Character.toUpperCase(word.charAt(0)) + word.substring(1).toLowerCase());
            }
        }

        return String.join(" ", result);//list creates of type string that why we join the string lsits by join methos 
    }
}
