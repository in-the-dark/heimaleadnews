package com.heima.model.common.dtos;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
public class PageRequestDto {

    protected Integer size;//注意，访问修饰符是protected的而不是private
    protected Integer page;

    public void checkParam() {
        if (this.page == null || this.page < 0) {
            setPage(1);
        }
        if (this.size == null || this.size < 0 || this.size > 100) {
            setSize(10);
        }
    }
}
