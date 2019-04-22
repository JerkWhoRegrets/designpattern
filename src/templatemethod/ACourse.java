package templatemethod;

public abstract class ACourse {
    protected final void makeCourse(){
        makePPT();
        makeVideo();
        if(isNeedWriteArticle()){
            writeArticle();
        }
        makePackage();
    }

    final void makePPT(){
        System.out.println("making ppt");
    }

    final void makeVideo(){
        System.out.println("making video");
    }

    final void writeArticle(){
        System.out.println("making article");
    }

    protected boolean isNeedWriteArticle(){
        return false;
    }

    abstract void makePackage();

}
