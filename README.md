# slidemenu_demo02
通过引入android-slidelibrary库，简单实现左侧向右滑动效果demo

      通过把Activity继承SlidingActivity
      1、继承SlidingActivity
      2、然后在onCreate中setBehindContentView(R.layout.leftmenu); 设置侧滑菜单的布局
      3、通过getSlidingMenu()得到SlidingMenu对象，然后设置样式
