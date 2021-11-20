package Basics.DataStructures;

import java.util.Stack;

//  /sct/cv/shared/./h.txt/../
//  /sct////cv/../shared/./h.txt/../
//  /../../../
public class upStart {
    public static void main(String[] args) {
        System.out.println(folderStack("/././/../sdv/"));
    }
    public static String folderStack(String folder){
        String[] splitFolder = folder.split("/");

        Stack<String> stack = new Stack<>();

        for(String i : splitFolder){
            if(!i.equals(".") && !i.equals("..") && !i.equals("")){
                stack.addElement(i);
            }
            else if(i.equals("..") && !stack.isEmpty()){
                stack.pop();
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("/");
        stack.forEach(s -> sb.append(s+"/"));

        if(sb.length()>1) sb.deleteCharAt(sb.length()-1);

        return sb.toString();
    }
}
