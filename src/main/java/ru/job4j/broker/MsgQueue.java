package ru.job4j.broker;

public class MsgQueue {

    public static final String SYSTEM = "sys";

    /**
     * Приоритет сообщений в системной очереди наинизший
     */
    public static final byte SYSTEM_QUEUE_PRIORITY = 0;

    private long senderId;

    private long receiverId;

    private String name;

    private long createdNum;

    private long processedNum;

    public MsgQueue() {
    }

    public MsgQueue(long senderId, long receiverId, String name) {
        this.senderId = senderId;
        this.receiverId = receiverId;
        this.name = name;
    }

    public long getSenderId() {
        return senderId;
    }

    public void setSenderId(long senderId) {
        this.senderId = senderId;
    }

    public long getReceiverId() {
        return receiverId;
    }

    public void setReceiverId(long receiverId) {
        this.receiverId = receiverId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getCreatedNum() {
        return createdNum;
    }

    public void setCreatedNum(long createdNum) {
        this.createdNum = createdNum;
    }

    public long getProcessedNum() {
        return processedNum;
    }

    public void setProcessedNum(long processedNum) {
        this.processedNum = processedNum;
    }
}

