# gitbucket-latex-plugin

A GitBucket plugin for rendering LaTeX file.

Based on [LaTeX.js](https://github.com/michael-brade/LaTeX.js).

## Screenshot

![screenshot](https://github.com/onukura/gitbucket-latex-plugin/raw/assets/screenshot.png)

## Install

1. Download *.jar from Releases.
2. Deploy it to `GITBUCKET_HOME/plugins`.
3. Restart GitBucket.

## Build from source

```sbt
sbt assembly
```

This makes the assembly package
`target/scala-2.13/gitbucket-latex-plugin-{plugin-version}.jar`
for deployment.

## Usage

This plugin process files with `.tex` extension.

## Version

Plugin version|GitBucket version
:---|:---
0.1.x |4.36.x -