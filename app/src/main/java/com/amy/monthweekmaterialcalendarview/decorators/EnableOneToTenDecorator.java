package com.amy.monthweekmaterialcalendarview.decorators;

import com.prolificinteractive.materialcalendarview.CalendarDay;
import com.prolificinteractive.materialcalendarview.DayViewDecorator;
import com.prolificinteractive.materialcalendarview.DayViewFacade;

/**
 * @author yangbo
 * @since 2018/2/5
 * @mail 903023560@qq.com
 */

public class EnableOneToTenDecorator implements DayViewDecorator {

    @Override
    public boolean shouldDecorate(CalendarDay day) {
        return day.getDay() <= 10;
    }

    @Override
    public void decorate(DayViewFacade view) {
        view.setDaysDisabled(true);
    }
}
