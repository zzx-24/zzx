public class Book {
    private String title;
    private int pageNum;

        public Book(){}
        public Book(String title, int pageNum){
        this.title = title;
        this.pageNum = pageNum;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public String getTitle(){
        return title;
    }
    public void setPageNum(int pageNum){
        this.pageNum = pageNum;
        if (this.pageNum < 200){
            this.pageNum = 200;
        }
    }
    public int getNum(){
        return pageNum;
    }

    @Override
    public String toString() {
        return "书名：" + title +"页数："+pageNum;
    }


}
