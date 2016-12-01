package com.lzm.slidemenu_demo02;

import com.lzm.slidingmenu.lib.SlidingMenu;
import com.lzm.slidingmenu.lib.app.SlidingActivity;

import android.os.Bundle;

/**
 * 通过把Activity继承SlidingActivity 1、继承SlidingActivity
 * 2、然后在onCreate中setBehindContentView(R.layout.leftmenu); 设置侧滑菜单的布局
 * 3、通过getSlidingMenu()得到SlidingMenu对象，然后设置样式
 *
 */
public class MainActivity extends SlidingActivity {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		setBehindContentView(R.layout.leftmenu);
		// configure the SlidingMenu
		SlidingMenu menu = getSlidingMenu();
		menu.setMode(SlidingMenu.LEFT);
		// 设置触摸屏幕的模式
		menu.setTouchModeAbove(SlidingMenu.TOUCHMODE_FULLSCREEN);
		// shadow_width,slidingmenu_offset值在values目录下的dimens.xml文件中设置
		// 设置滑动菜单视图的宽度 值越大，被隐藏的菜单宽度越窄
		menu.setShadowWidthRes(R.dimen.shadow_width);
		// 设置滑动菜单视图阴影的宽度 值越大，被隐藏菜单阴影的宽度越大
		menu.setShadowDrawable(R.drawable.shadow);

		// 设置滑动菜单视图的宽度
		menu.setBehindOffsetRes(R.dimen.slidingmenu_offset);
		// 设置渐入渐出效果的值
		menu.setFadeDegree(0.35f);
		/**
		 * SLIDING_WINDOW will include the Title/ActionBar in the content
		 * section of the SlidingMenu, while SLIDING_CONTENT does not.
		 */
		// menu.attachToActivity(this, SlidingMenu.SLIDING_CONTENT);
		// menu.setMenu(R.layout.leftmenu);

	}

}
