package web.ssm.vo;

/**
 * Created by 14999 on 2017/11/4.
 */
public class ResultInfo {
    private String resultMessage;
    private int resultCode;

    public String getResultMessage() {
        return resultMessage;
    }

    public void setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
    }

    public int getResultCode() {
        return resultCode;
    }

    public void setResultCode(int resultCode) {
        this.resultCode = resultCode;
    }

    public ResultInfo() {
    }

    public ResultInfo(String resultMessage, int resultCode) {
        this.resultMessage = resultMessage;
        this.resultCode = resultCode;
    }
}
