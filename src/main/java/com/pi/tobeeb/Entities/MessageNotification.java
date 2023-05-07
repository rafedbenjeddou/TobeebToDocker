package com.pi.tobeeb.Entities;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MessageNotification {
    private String id;
    private String senderId;
    private String senderName;
}
