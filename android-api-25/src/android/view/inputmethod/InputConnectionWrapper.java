/*
* Copyright (C) 2007-2008 The Android Open Source Project
*
* Licensed under the Apache License, Version 2.0 (the "License"); you may not
* use this file except in compliance with the License. You may obtain a copy of
* the License at
*
* http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
* WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
* License for the specific language governing permissions and limitations under
* the License.
*/

package android.view.inputmethod;
public class InputConnectionWrapper
  implements android.view.inputmethod.InputConnection
{
public  InputConnectionWrapper(android.view.inputmethod.InputConnection target, boolean mutable) { throw new RuntimeException("Stub!"); }
public  void setTarget(android.view.inputmethod.InputConnection target) { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence getTextBeforeCursor(int n, int flags) { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence getTextAfterCursor(int n, int flags) { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence getSelectedText(int flags) { throw new RuntimeException("Stub!"); }
public  int getCursorCapsMode(int reqModes) { throw new RuntimeException("Stub!"); }
public  android.view.inputmethod.ExtractedText getExtractedText(android.view.inputmethod.ExtractedTextRequest request, int flags) { throw new RuntimeException("Stub!"); }
public  boolean deleteSurroundingTextInCodePoints(int beforeLength, int afterLength) { throw new RuntimeException("Stub!"); }
public  boolean deleteSurroundingText(int beforeLength, int afterLength) { throw new RuntimeException("Stub!"); }
public  boolean setComposingText(java.lang.CharSequence text, int newCursorPosition) { throw new RuntimeException("Stub!"); }
public  boolean setComposingRegion(int start, int end) { throw new RuntimeException("Stub!"); }
public  boolean finishComposingText() { throw new RuntimeException("Stub!"); }
public  boolean commitText(java.lang.CharSequence text, int newCursorPosition) { throw new RuntimeException("Stub!"); }
public  boolean commitCompletion(android.view.inputmethod.CompletionInfo text) { throw new RuntimeException("Stub!"); }
public  boolean commitCorrection(android.view.inputmethod.CorrectionInfo correctionInfo) { throw new RuntimeException("Stub!"); }
public  boolean setSelection(int start, int end) { throw new RuntimeException("Stub!"); }
public  boolean performEditorAction(int editorAction) { throw new RuntimeException("Stub!"); }
public  boolean performContextMenuAction(int id) { throw new RuntimeException("Stub!"); }
public  boolean beginBatchEdit() { throw new RuntimeException("Stub!"); }
public  boolean endBatchEdit() { throw new RuntimeException("Stub!"); }
public  boolean sendKeyEvent(android.view.KeyEvent event) { throw new RuntimeException("Stub!"); }
public  boolean clearMetaKeyStates(int states) { throw new RuntimeException("Stub!"); }
public  boolean reportFullscreenMode(boolean enabled) { throw new RuntimeException("Stub!"); }
public  boolean performPrivateCommand(java.lang.String action, android.os.Bundle data) { throw new RuntimeException("Stub!"); }
public  boolean requestCursorUpdates(int cursorUpdateMode) { throw new RuntimeException("Stub!"); }
public  android.os.Handler getHandler() { throw new RuntimeException("Stub!"); }
public  void closeConnection() { throw new RuntimeException("Stub!"); }
public  boolean commitContent(android.view.inputmethod.InputContentInfo inputContentInfo, int flags, android.os.Bundle opts) { throw new RuntimeException("Stub!"); }
}
