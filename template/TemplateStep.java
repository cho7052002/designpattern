public abstract class TemplateStep {
    //Template을 상속한 클래스에서 구현해야 하는 step
    protected abstract void firstStep();
    protected abstract void secondStep();
    protected abstract void thirdStep();
    
    //abstract가 아닌, 구현해도 되고 안해도 되는 step
    protected void customStep(){}
    //isUsingCustomStep을 상속해 return true;로 바꾸면 customStep을 사용하게 된다.
    protected boolean isUsingCustomStep(){
        return false;
    }
    
    public final void doStep(){
        firstStep();
        secondStep();
        thirdStep();
        if(isUsingCustomStep()){
            customStep();
        }
    }
}
