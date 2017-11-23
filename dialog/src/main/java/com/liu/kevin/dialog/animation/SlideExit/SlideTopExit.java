package com.liu.kevin.dialog.animation.SlideExit;

import android.util.DisplayMetrics;
import android.view.View;

import com.nineoldandroids.animation.ObjectAnimator;
import com.liu.kevin.dialog.animation.BaseAnimatorSet;

public class SlideTopExit extends BaseAnimatorSet {
	@Override
	public void setAnimation(View view) {
		DisplayMetrics dm = view.getContext().getResources().getDisplayMetrics();
		animatorSet.playTogether(//
				ObjectAnimator.ofFloat(view, "translationY", 0, -250 * dm.density), //
				ObjectAnimator.ofFloat(view, "alpha", 1, 0));
	}
}
