package com.formatter;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.apache.commons.lang3.StringUtils;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Arguments {

    private String alignment;
    private Integer width;

    public void setArguments(String[] args) {
        int index = 0;

        if (!StringUtils.isEmpty(args[index])) {
            this.alignment = args[index];
            index++;
        }

        if (!StringUtils.isEmpty(args[index])) {
            this.width = Integer.parseInt(args[index]);
        }
    }
}
