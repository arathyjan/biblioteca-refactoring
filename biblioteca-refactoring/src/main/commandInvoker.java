package main;

public class commandInvoker {
    command cmd;
    public commandInvoker(command cmd){
        this.cmd=cmd;
    }
    public void setCommand(command cmd){
        this.cmd=cmd;
    }
    public void invoke(){
        cmd.execute();
    }
}
