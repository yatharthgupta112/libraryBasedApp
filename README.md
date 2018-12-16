APP
===

**myapp -  final app**

How to Run
---

* download myapp
* open app and click  

Library
===

**project lib -  contains the app converted into library**

Convert an app module to a library module
---

If you have an existing app module with all the code you want to reuse, you can turn it into a library module as follows:

   1. Open the module-level build.gradle file.
   2. Delete the line for the applicationId. Only an Android app module can define this.
   3. At the top of the file, you should see the following:
   ```
   apply plugin: 'com.android.application'
``
	  -Change it to the following:
```
			apply plugin: 'com.android.library'
```
   4. Save the file and click File > Sync Project with Gradle Files.

That's it. The entire structure of the module remains the same, but it now operates as an Android library and the build will now create an AAR file instead of an APK.

When you want to build the AAR file, select the library module in the Project window and then click Build > Build APK.

---

References
---
- Converted library using [link](https://developer.android.com/studio/projects/android-library).
- Uploaded Library ugin [youtube video] (https://www.youtube.com/watch?v=RYiZZprUNJw).

 	