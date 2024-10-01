package com.rcz.webexample.utils.VO;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Schema(description = "ID")
@Data
public class ID {

    @Schema(description = "Id")
    private String id;

}
