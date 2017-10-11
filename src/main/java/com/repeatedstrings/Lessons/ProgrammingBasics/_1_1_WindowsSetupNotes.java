package com.repeatedstrings.Lessons.ProgrammingBasics;

public class _1_1_WindowsSetupNotes {
        /*
        no useful code here, just installation notes
        Java
            http://www.oracle.com/technetwork/java/javase/downloads/index.html
        Gradle
            https://gradle.org/releases/
        Intellij
            https://www.jetbrains.com/idea/download/#section=windows
        minecraft forge (version 1.11.3) -> https://files.minecraftforge.net/maven/net/minecraftforge/forge/index_1.11.2.html
                mdk, not the installer, universal, etc.
            Sign up for account with GitHub.com -source code storage.


        Java install notes
                use the java 8 version halfway down the page, don't use 9
            Downloading the Installer
                If you save the self-installing executable file to disk without running it from the download page at the web site, note the file size specified on the download page. After the download has completed, verify that you have downloaded the complete file.

            Running the JDK Installer
                You must have administrative permissions in order to install the JDK on Microsoft Windows.
                The file jdk-8version-windows-i586-i.exe is the JDK installer for 32-bit systems. The file jdk-8version-windows-x64.exe is the JDK installer for 64-bit systems. If you downloaded either file instead of running it directly from the web site, double-click the installer's icon. Then, follow the instructions the installer provides. When finished with the installation, you can delete the downloaded file to recover disk space.

                Installers for JDK 7u6 and later install the JavaFX SDK and integrate it into the JDK installation directory.
                Installers for JDK 7u2 to 7u5 install the JDK first, then start the JavaFX SDK installer, which installs JavaFX SDK in the default directory C:\Program Files\Oracle\JavaFX 2.0 SDK or C:\Program Files (x86)\Oracle\JavaFX 2.0 SDK on 64-bit operating systems. If you want to install the JavaFX SDK (version 2.0.2) with JDK 7u1 or earlier, see http://docs.oracle.com/javafx/2/installation/jfxpub-installation.htm for more information.
            Setting the $PATH
                Click Start, then Control Panel, then System.
                Click Advanced, then Environment Variables.

                Add the location of the bin folder of the JDK installation to the PATH variable in System Variables. The following is a typical value for the PATH variable:
                C:\WINDOWS\system32;C:\WINDOWS;C:\Program Files\Java\jdk1.8.0\bin
        Gradle install notes:
            Download the latest Gradle distribution

            The current Gradle release is version 4.2.1, released on 02 Oct 2017. The distribution zip file comes in two flavors:
            If in doubt, choose the binary-only version and browse docs and sources online.

            Create a new directory C:\Gradle with File Explorer.
            Open a second File Explorer window and go to the directory where the Gradle distribution was downloaded. Double-click the ZIP archive to expose the content. Drag the content folder gradle-4.2.1 to your newly created C:\Gradle folder.
            Alternatively you can unpack the Gradle distribution ZIP into C:\Gradle using an archiver tool of your choice.

            In File Explorer right-click on the This PC (or Computer) icon, then click Properties -> Advanced System Settings -> Environmental Variables.
            Under System Variables select Path, then click Edit. Add an entry for C:\Gradle\gradle-4.2.1\bin. Click OK to save.

            Verify your installation
            Open a console (or a Windows command prompt) and run gradle -v to run gradle

    Now to actually use all this stuff!
        mkdir ~/GitDir
        cd ~/GitDir
        mkdir mods
        cd mods
        cp ~/Downloads/forge* .
        unzip forge*
        gedit build.gradle
            //update these!
            version = "1.0"
            group = "mods"
            archivesBaseName = "mods"

        // power up intellij
        cd ~/Downloads
        tar -xvf idea*
        cd idea*
        cd bin
        ./idea.sh
            // for new projects
            import project, open build.gradle
            bottom left corner icon, gradle view
            open forgegradle, run setupDecompWorkspace
                              run genIntellijRuns

            for git import:
                File -> New -> Project From Version Control -> GitHub -> sign in using password
                clone this: https://github.com/repeatedstrings/learnToCodeWithMinecraft.git



        www.shortcutfoo.com/app/dojos/intellij-idea-win/cheatsheet
     */
}
