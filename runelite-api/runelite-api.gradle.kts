/*
 * Copyright (c) 2019 Owain van Brakel <https://github.com/Owain94>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

description = "RuneLite API"

plugins {
    id("com.openosrs.interfaceparser")
}

dependencies {
    annotationProcessor(group = "org.projectlombok", name = "lombok", version = ProjectVersions.lombokVersion)

    compileOnly(group = "org.projectlombok", name = "lombok", version = ProjectVersions.lombokVersion)

    compileOnly(project(":cache"))

    implementation(group = "com.google.code.findbugs", name = "jsr305", version = "3.0.2")
    implementation(group = "com.google.guava", name = "guava", version = "30.1.1-jre")
    implementation(group = "org.apache.commons", name = "commons-text", version = "1.9")
    implementation(group = "org.slf4j", name = "slf4j-api", version = "1.7.32")
    implementation(group = "org.jetbrains", name = "annotations", version = "22.0.0")

    testImplementation(group = "junit", name = "junit", version = "4.12")

    testAnnotationProcessor(group = "org.projectlombok", name = "lombok", version = ProjectVersions.lombokVersion)
    testCompileOnly(group = "org.projectlombok", name = "lombok", version = ProjectVersions.lombokVersion)
}

    tasks {
        createInterfaceComponents {
            val inp = "${projectDir}/src/main/interfaces"
            val out = "${buildDir}/generated-sources"

            inputs.dir(inp)
            outputs.dir(out)

            input.set(file(inp))
            output.set(file(out))

            sourceSets["main"].java.srcDir(file(out))
            finalizedBy("compileJava")
        }

        processResources {
            dependsOn("createInterfaceComponents")
        }

        withType<Checkstyle> {
            group = "verification"

            exclude("net/runelite/api/widgets/ComponentID.java")
            exclude("net/runelite/api/widgets/InterfaceID.java")
        }
    }