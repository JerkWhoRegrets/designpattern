package templatemethod;

public class DesignCourse extends ACourse {
    @Override
    void makePackage() {
        System.out.println("making package");
    }

    @Override
    protected boolean isNeedWriteArticle() {
        return super.isNeedWriteArticle();
    }
}
