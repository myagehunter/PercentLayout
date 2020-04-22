package com.layout.support;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


/**
 * xmlns:android=”http://schemas.android.com/apk/res/android”
 *  xmlns --->xml namespace  声明我们开始定义的命名空间
 *  andorid -->namespace-prefix 它是命名空间名字
 *  作用：相当于程序中的URI固定不变，给我们开发的时候语法文件提示输入
 *
 * xmlns:tools=”http://schemas.android.com/tools”
 * tools:一个属于开发阶段的工具，理解为开发阶段编写的属性，当安装手机上时候属性消失，比如测试时候添加中文名称填满视图
 * 如果添加tools:context=”包名.MainActivity”可以在视图中看到MainActivity主题的效果
 * tools:layout=@layout/yourfragmentlayoutname  在测试阶段就在布局预览窗口上显示Activity上加载一个fragment
 *
 * 自定义命名空间  xmlns:app=”http://schemas.android.com/apk/res-auto”
 *  作用:当我们自定义布局view 时候，给xml里添加属性的作用，达到改变视图 统一这样命名，属性写在attr里
 *
 * Android ConstraintLayout百分比布局-适配终结者
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_con);
    }
}
