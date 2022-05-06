# Memento Pattern
Consider an Editor class, that has a String variable called **content**.
This content can be edited (changed/updated). But, there should be a way 
to **undo** any change that was made to the object at any time. 

`
Editor  
    private String content;  
    public String getContent();  
    public void setContent(String newContent);  
`
