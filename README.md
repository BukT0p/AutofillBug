# AutofillBug
This repo is a minimal Android project that illustrates TextInputEditText + Autofill framework bug:
Stacktrace:
<p>
<code>FATAL EXCEPTION: main
Process: com.vyakunin.kotlintests, PID: 16269

java.lang.NullPointerException: Attempt to invoke virtual method 'void android.view.View.getBoundsOnScreen(android.graphics.Rect)' on a null object reference
at android.app.assist.AssistStructure$WindowNode.<init>(AssistStructure.java:484)</br>
at android.app.assist.AssistStructure.<init>(AssistStructure.java:1908)</br>
at android.app.ActivityThread.handleRequestAssistContextExtras(ActivityThread.java:3035)</br>
at android.app.ActivityThread$H.handleMessage(ActivityThread.java:1807)</br>
at android.os.Handler.dispatchMessage(Handler.java:105)</br>
at android.os.Looper.loop(Looper.java:164)</br>
at android.app.ActivityThread.main(ActivityThread.java:6541)</br>
at java.lang.reflect.Method.invoke(Native Method)</br>
at com.android.internal.os.Zygote$MethodAndArgsCaller.run(Zygote.java:240)</br>
at com.android.internal.os.ZygoteInit.main(ZygoteInit.java:767)</br>
</code>
</p>

Linked bugs:</br>
https://issuetracker.google.com/issues/62834931</br>
https://issuetracker.google.com/issues/67675432</br>
</br>
https://stackoverflow.com/questions/45731372/disabling-android-o-auto-fill-service-for-an-application</br>
