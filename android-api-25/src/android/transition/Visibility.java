/*
* Copyright (C) 2013 The Android Open Source Project
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
*      http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/

package android.transition;
public abstract class Visibility
  extends android.transition.Transition
{
public  Visibility() { throw new RuntimeException("Stub!"); }
public  Visibility(android.content.Context context, android.util.AttributeSet attrs) { throw new RuntimeException("Stub!"); }
public  void setMode(int mode) { throw new RuntimeException("Stub!"); }
public  int getMode() { throw new RuntimeException("Stub!"); }
public  java.lang.String[] getTransitionProperties() { throw new RuntimeException("Stub!"); }
public  void captureStartValues(android.transition.TransitionValues transitionValues) { throw new RuntimeException("Stub!"); }
public  void captureEndValues(android.transition.TransitionValues transitionValues) { throw new RuntimeException("Stub!"); }
public  boolean isVisible(android.transition.TransitionValues values) { throw new RuntimeException("Stub!"); }
public  android.animation.Animator createAnimator(android.view.ViewGroup sceneRoot, android.transition.TransitionValues startValues, android.transition.TransitionValues endValues) { throw new RuntimeException("Stub!"); }
public  android.animation.Animator onAppear(android.view.ViewGroup sceneRoot, android.transition.TransitionValues startValues, int startVisibility, android.transition.TransitionValues endValues, int endVisibility) { throw new RuntimeException("Stub!"); }
public  android.animation.Animator onAppear(android.view.ViewGroup sceneRoot, android.view.View view, android.transition.TransitionValues startValues, android.transition.TransitionValues endValues) { throw new RuntimeException("Stub!"); }
public  android.animation.Animator onDisappear(android.view.ViewGroup sceneRoot, android.transition.TransitionValues startValues, int startVisibility, android.transition.TransitionValues endValues, int endVisibility) { throw new RuntimeException("Stub!"); }
public  boolean isTransitionRequired(android.transition.TransitionValues startValues, android.transition.TransitionValues newValues) { throw new RuntimeException("Stub!"); }
public  android.animation.Animator onDisappear(android.view.ViewGroup sceneRoot, android.view.View view, android.transition.TransitionValues startValues, android.transition.TransitionValues endValues) { throw new RuntimeException("Stub!"); }
public static final int MODE_IN = 1;
public static final int MODE_OUT = 2;
}
