package com.repeatedstrings.Lessons.ProgrammingBasics;

public class _1_3_LinuxSetupNotes {

    /*
        no useful code here, just installation notes

        items to download:
            intellij -> https://www.jetbrains.com/idea/download/#section=linux
                Community edition
            Gradle -> https://gradle.org/releases/
            minecraft forge (version 1.11.3) -> https://files.minecraftforge.net/maven/net/minecraftforge/forge/index_1.11.2.html
                mdk, not the installer, universal, etc.
            Sign up for account with GitHub.com -source code storage.

        items to install:
            java ->
                sudo apt install default-jre
                sudo apt install default-jdk
                    sudo update-alternatives --config java
                    sudo gedit /etc/environment //copy path from last command and add to end
                    source /etc/environment
            gradle
                sudo apt install gradle
            git
                sudo apt install git

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


 // testrepeatedstrings



        www.shortcutfoo.com/app/dojos/intellij-idea-win/cheatsheet
     */
}
