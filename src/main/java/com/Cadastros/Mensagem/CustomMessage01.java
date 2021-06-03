package com.Cadastros.Mensagem;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CustomMessage01 {

    private String messageID;
    private String message;
    private Date messageDate;


}
