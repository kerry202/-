package com.amy.monthweekmaterialcalendarview.decorators;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;

import com.prolificinteractive.materialcalendarview.CalendarDay;
import com.prolificinteractive.materialcalendarview.DayViewDecorator;
import com.prolificinteractive.materialcalendarview.DayViewFacade;

import java.util.Random;

/**
 * @author yangbo
 * @since 2018/2/5
 * @mail 903023560@qq.com
 */

public class ColorDecorator  implements DayViewDecorator {

    private  int color;
    private  CalendarDay calendarDay;
    public ColorDecorator(CalendarDay day,int color) {
        this.calendarDay=day;
        this.color=color;
    }

    @Override
    public boolean shouldDecorate(CalendarDay day) {

        return calendarDay.getDay()==day.getDay();
    }

    @Override
    public void decorate(DayViewFacade view) {
        int selectcolor=color;
        GradientDrawable drawable = new GradientDrawable();
        drawable.setCornerRadius(32);
        drawable.setColor(selectcolor);
        drawable.setStroke(1, selectcolor);
        view.setSelectionDrawable(drawable);
    }
}
