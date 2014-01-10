package com.moowork.gradle.node.task

import org.gradle.api.tasks.InputFile
import org.gradle.api.tasks.OutputDirectory

class NpmInstallTask
    extends NpmTask
{
    public final static String NAME = 'npmInstall'

    public NpmInstallTask()
    {
        this.group = 'Node'
        this.description = 'Install node packages from package.json.'
        setArgs( ['install'] )
    }

    @InputFile
    File getPackageJson()
    {
        return new File( this.project.getProjectDir(), 'package.json' )
    }

    @OutputDirectory
    File getNodeModules()
    {
        return new File( this.project.getProjectDir(), 'node_modules' )
    }
}
