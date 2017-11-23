package com.liu.kevin.dialog.animation.FallEnter;

import android.view.View;

import com.nineoldandroids.animation.ObjectAnimator;
import com.liu.kevin.dialog.animation.BaseAnimatorSet;

public class FallRotateEnter extends BaseAnimatorSet {
	@Override
	public void setAnimation(View view) {
		animatorSet.playTogether(ObjectAnimator.ofFloat(view, "scaleX", 2, 1.5f, 1),//
				ObjectAnimator.ofFloat(view, "scaleY", 2, 1.5f, 1),//
				ObjectAnimator.ofFloat(view, "rotation", 45, 0),//
				ObjectAnimator.ofFloat(view, "alpha", 0, 1));
	}
}
