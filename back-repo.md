

<ruta> .classpath
---
<?xml version="1.0" encoding="UTF-8"?>
<classpath>
	<classpathentry kind="src" output="target/classes" path="src/main/java">
		<attributes>
			<attribute name="optional" value="true"/>
			<attribute name="maven.pomderived" value="true"/>
		</attributes>
	</classpathentry>
	<classpathentry excluding="**" kind="src" output="target/classes" path="src/main/resources">
		<attributes>
			<attribute name="maven.pomderived" value="true"/>
			<attribute name="optional" value="true"/>
		</attributes>
	</classpathentry>
	<classpathentry kind="src" output="target/test-classes" path="src/test/java">
		<attributes>
			<attribute name="optional" value="true"/>
			<attribute name="maven.pomderived" value="true"/>
			<attribute name="test" value="true"/>
		</attributes>
	</classpathentry>
	<classpathentry excluding="**" kind="src" output="target/test-classes" path="src/test/resources">
		<attributes>
			<attribute name="maven.pomderived" value="true"/>
			<attribute name="test" value="true"/>
			<attribute name="optional" value="true"/>
		</attributes>
	</classpathentry>
	<classpathentry kind="con" path="org.eclipse.jdt.launching.JRE_CONTAINER/org.eclipse.jdt.internal.debug.ui.launcher.StandardVMType/JavaSE-17">
		<attributes>
			<attribute name="maven.pomderived" value="true"/>
		</attributes>
	</classpathentry>
	<classpathentry kind="con" path="org.eclipse.m2e.MAVEN2_CLASSPATH_CONTAINER">
		<attributes>
			<attribute name="maven.pomderived" value="true"/>
		</attributes>
	</classpathentry>
	<classpathentry kind="src" path="target/generated-sources/annotations">
		<attributes>
			<attribute name="optional" value="true"/>
			<attribute name="maven.pomderived" value="true"/>
			<attribute name="ignore_optional_problems" value="true"/>
			<attribute name="m2e-apt" value="true"/>
		</attributes>
	</classpathentry>
	<classpathentry kind="src" output="target/test-classes" path="target/generated-test-sources/test-annotations">
		<attributes>
			<attribute name="optional" value="true"/>
			<attribute name="maven.pomderived" value="true"/>
			<attribute name="ignore_optional_problems" value="true"/>
			<attribute name="m2e-apt" value="true"/>
			<attribute name="test" value="true"/>
		</attributes>
	</classpathentry>
	<classpathentry kind="output" path="target/classes"/>
</classpath>


---


<ruta> .factorypath
---
<factorypath>
    <factorypathentry kind="VARJAR" id="M2_REPO/org/projectlombok/lombok/1.18.38/lombok-1.18.38.jar" enabled="true" runInBatchMode="false"/>
</factorypath>


---


<ruta> .gitattributes
---
/mvnw text eol=lf
*.cmd text eol=crlf


---


<ruta> .gitignore
---
HELP.md
target/
.mvn/wrapper/maven-wrapper.jar
!**/src/main/**/target/
!**/src/test/**/target/

### STS ###
.apt_generated
.classpath
.factorypath
.project
.settings
.springBeans
.sts4-cache

### IntelliJ IDEA ###
.idea
*.iws
*.iml
*.ipr

### NetBeans ###
/nbproject/private/
/nbbuild/
/dist/
/nbdist/
/.nb-gradle/
build/
!**/src/main/**/build/
!**/src/test/**/build/

### VS Code ###
.vscode/


---


<ruta> .project
---
<?xml version="1.0" encoding="UTF-8"?>
<projectDescription>
	<name>grupo09</name>
	<comment></comment>
	<projects>
	</projects>
	<buildSpec>
		<buildCommand>
			<name>org.eclipse.jdt.core.javabuilder</name>
			<arguments>
			</arguments>
		</buildCommand>
		<buildCommand>
			<name>org.eclipse.m2e.core.maven2Builder</name>
			<arguments>
			</arguments>
		</buildCommand>
		<buildCommand>
			<name>org.springframework.ide.eclipse.boot.validation.springbootbuilder</name>
			<arguments>
			</arguments>
		</buildCommand>
	</buildSpec>
	<natures>
		<nature>org.eclipse.jdt.core.javanature</nature>
		<nature>org.eclipse.m2e.core.maven2Nature</nature>
	</natures>
</projectDescription>


---


<ruta> .\HELP.md
---
# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/4.0.5/maven-plugin)
* [Create an OCI image](https://docs.spring.io/spring-boot/4.0.5/maven-plugin/build-image.html)
* [Spring Data JPA](https://docs.spring.io/spring-boot/4.0.5/reference/data/sql.html#data.sql.jpa-and-spring-data)
* [Spring Boot DevTools](https://docs.spring.io/spring-boot/4.0.5/reference/using/devtools.html)
* [Thymeleaf](https://docs.spring.io/spring-boot/4.0.5/reference/web/servlet.html#web.servlet.spring-mvc.template-engines)
* [Spring Web Services](https://docs.spring.io/spring-boot/4.0.5/reference/io/webservices.html)

### Guides
The following guides illustrate how to use some features concretely:

* [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa/)
* [Accessing data with MySQL](https://spring.io/guides/gs/accessing-data-mysql/)
* [Handling Form Submission](https://spring.io/guides/gs/handling-form-submission/)
* [Producing a SOAP web service](https://spring.io/guides/gs/producing-web-service/)

### Maven Parent overrides

Due to Maven's design, elements are inherited from the parent POM to the project POM.
While most of the inheritance is fine, it also inherits unwanted elements like `<license>` and `<developers>` from the parent.
To prevent this, the project POM contains empty overrides for these elements.
If you manually switch to a different parent and actually want the inheritance, you need to remove those overrides.



---


<ruta> .\mvnw
---
#!/bin/sh
# ----------------------------------------------------------------------------
# Licensed to the Apache Software Foundation (ASF) under one
# or more contributor license agreements.  See the NOTICE file
# distributed with this work for additional information
# regarding copyright ownership.  The ASF licenses this file
# to you under the Apache License, Version 2.0 (the
# "License"); you may not use this file except in compliance
# with the License.  You may obtain a copy of the License at
#
#    http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing,
# software distributed under the License is distributed on an
# "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
# KIND, either express or implied.  See the License for the
# specific language governing permissions and limitations
# under the License.
# ----------------------------------------------------------------------------

# ----------------------------------------------------------------------------
# Apache Maven Wrapper startup batch script, version 3.3.4
#
# Optional ENV vars
# -----------------
#   JAVA_HOME - location of a JDK home dir, required when download maven via java source
#   MVNW_REPOURL - repo url base for downloading maven distribution
#   MVNW_USERNAME/MVNW_PASSWORD - user and password for downloading maven
#   MVNW_VERBOSE - true: enable verbose log; debug: trace the mvnw script; others: silence the output
# ----------------------------------------------------------------------------

set -euf
[ "${MVNW_VERBOSE-}" != debug ] || set -x

# OS specific support.
native_path() { printf %s\\n "$1"; }
case "$(uname)" in
CYGWIN* | MINGW*)
  [ -z "${JAVA_HOME-}" ] || JAVA_HOME="$(cygpath --unix "$JAVA_HOME")"
  native_path() { cygpath --path --windows "$1"; }
  ;;
esac

# set JAVACMD and JAVACCMD
set_java_home() {
  # For Cygwin and MinGW, ensure paths are in Unix format before anything is touched
  if [ -n "${JAVA_HOME-}" ]; then
    if [ -x "$JAVA_HOME/jre/sh/java" ]; then
      # IBM's JDK on AIX uses strange locations for the executables
      JAVACMD="$JAVA_HOME/jre/sh/java"
      JAVACCMD="$JAVA_HOME/jre/sh/javac"
    else
      JAVACMD="$JAVA_HOME/bin/java"
      JAVACCMD="$JAVA_HOME/bin/javac"

      if [ ! -x "$JAVACMD" ] || [ ! -x "$JAVACCMD" ]; then
        echo "The JAVA_HOME environment variable is not defined correctly, so mvnw cannot run." >&2
        echo "JAVA_HOME is set to \"$JAVA_HOME\", but \"\$JAVA_HOME/bin/java\" or \"\$JAVA_HOME/bin/javac\" does not exist." >&2
        return 1
      fi
    fi
  else
    JAVACMD="$(
      'set' +e
      'unset' -f command 2>/dev/null
      'command' -v java
    )" || :
    JAVACCMD="$(
      'set' +e
      'unset' -f command 2>/dev/null
      'command' -v javac
    )" || :

    if [ ! -x "${JAVACMD-}" ] || [ ! -x "${JAVACCMD-}" ]; then
      echo "The java/javac command does not exist in PATH nor is JAVA_HOME set, so mvnw cannot run." >&2
      return 1
    fi
  fi
}

# hash string like Java String::hashCode
hash_string() {
  str="${1:-}" h=0
  while [ -n "$str" ]; do
    char="${str%"${str#?}"}"
    h=$(((h * 31 + $(LC_CTYPE=C printf %d "'$char")) % 4294967296))
    str="${str#?}"
  done
  printf %x\\n $h
}

verbose() { :; }
[ "${MVNW_VERBOSE-}" != true ] || verbose() { printf %s\\n "${1-}"; }

die() {
  printf %s\\n "$1" >&2
  exit 1
}

trim() {
  # MWRAPPER-139:
  #   Trims trailing and leading whitespace, carriage returns, tabs, and linefeeds.
  #   Needed for removing poorly interpreted newline sequences when running in more
  #   exotic environments such as mingw bash on Windows.
  printf "%s" "${1}" | tr -d '[:space:]'
}

scriptDir="$(dirname "$0")"
scriptName="$(basename "$0")"

# parse distributionUrl and optional distributionSha256Sum, requires .mvn/wrapper/maven-wrapper.properties
while IFS="=" read -r key value; do
  case "${key-}" in
  distributionUrl) distributionUrl=$(trim "${value-}") ;;
  distributionSha256Sum) distributionSha256Sum=$(trim "${value-}") ;;
  esac
done <"$scriptDir/.mvn/wrapper/maven-wrapper.properties"
[ -n "${distributionUrl-}" ] || die "cannot read distributionUrl property in $scriptDir/.mvn/wrapper/maven-wrapper.properties"

case "${distributionUrl##*/}" in
maven-mvnd-*bin.*)
  MVN_CMD=mvnd.sh _MVNW_REPO_PATTERN=/maven/mvnd/
  case "${PROCESSOR_ARCHITECTURE-}${PROCESSOR_ARCHITEW6432-}:$(uname -a)" in
  *AMD64:CYGWIN* | *AMD64:MINGW*) distributionPlatform=windows-amd64 ;;
  :Darwin*x86_64) distributionPlatform=darwin-amd64 ;;
  :Darwin*arm64) distributionPlatform=darwin-aarch64 ;;
  :Linux*x86_64*) distributionPlatform=linux-amd64 ;;
  *)
    echo "Cannot detect native platform for mvnd on $(uname)-$(uname -m), use pure java version" >&2
    distributionPlatform=linux-amd64
    ;;
  esac
  distributionUrl="${distributionUrl%-bin.*}-$distributionPlatform.zip"
  ;;
maven-mvnd-*) MVN_CMD=mvnd.sh _MVNW_REPO_PATTERN=/maven/mvnd/ ;;
*) MVN_CMD="mvn${scriptName#mvnw}" _MVNW_REPO_PATTERN=/org/apache/maven/ ;;
esac

# apply MVNW_REPOURL and calculate MAVEN_HOME
# maven home pattern: ~/.m2/wrapper/dists/{apache-maven-<version>,maven-mvnd-<version>-<platform>}/<hash>
[ -z "${MVNW_REPOURL-}" ] || distributionUrl="$MVNW_REPOURL$_MVNW_REPO_PATTERN${distributionUrl#*"$_MVNW_REPO_PATTERN"}"
distributionUrlName="${distributionUrl##*/}"
distributionUrlNameMain="${distributionUrlName%.*}"
distributionUrlNameMain="${distributionUrlNameMain%-bin}"
MAVEN_USER_HOME="${MAVEN_USER_HOME:-${HOME}/.m2}"
MAVEN_HOME="${MAVEN_USER_HOME}/wrapper/dists/${distributionUrlNameMain-}/$(hash_string "$distributionUrl")"

exec_maven() {
  unset MVNW_VERBOSE MVNW_USERNAME MVNW_PASSWORD MVNW_REPOURL || :
  exec "$MAVEN_HOME/bin/$MVN_CMD" "$@" || die "cannot exec $MAVEN_HOME/bin/$MVN_CMD"
}

if [ -d "$MAVEN_HOME" ]; then
  verbose "found existing MAVEN_HOME at $MAVEN_HOME"
  exec_maven "$@"
fi

case "${distributionUrl-}" in
*?-bin.zip | *?maven-mvnd-?*-?*.zip) ;;
*) die "distributionUrl is not valid, must match *-bin.zip or maven-mvnd-*.zip, but found '${distributionUrl-}'" ;;
esac

# prepare tmp dir
if TMP_DOWNLOAD_DIR="$(mktemp -d)" && [ -d "$TMP_DOWNLOAD_DIR" ]; then
  clean() { rm -rf -- "$TMP_DOWNLOAD_DIR"; }
  trap clean HUP INT TERM EXIT
else
  die "cannot create temp dir"
fi

mkdir -p -- "${MAVEN_HOME%/*}"

# Download and Install Apache Maven
verbose "Couldn't find MAVEN_HOME, downloading and installing it ..."
verbose "Downloading from: $distributionUrl"
verbose "Downloading to: $TMP_DOWNLOAD_DIR/$distributionUrlName"

# select .zip or .tar.gz
if ! command -v unzip >/dev/null; then
  distributionUrl="${distributionUrl%.zip}.tar.gz"
  distributionUrlName="${distributionUrl##*/}"
fi

# verbose opt
__MVNW_QUIET_WGET=--quiet __MVNW_QUIET_CURL=--silent __MVNW_QUIET_UNZIP=-q __MVNW_QUIET_TAR=''
[ "${MVNW_VERBOSE-}" != true ] || __MVNW_QUIET_WGET='' __MVNW_QUIET_CURL='' __MVNW_QUIET_UNZIP='' __MVNW_QUIET_TAR=v

# normalize http auth
case "${MVNW_PASSWORD:+has-password}" in
'') MVNW_USERNAME='' MVNW_PASSWORD='' ;;
has-password) [ -n "${MVNW_USERNAME-}" ] || MVNW_USERNAME='' MVNW_PASSWORD='' ;;
esac

if [ -z "${MVNW_USERNAME-}" ] && command -v wget >/dev/null; then
  verbose "Found wget ... using wget"
  wget ${__MVNW_QUIET_WGET:+"$__MVNW_QUIET_WGET"} "$distributionUrl" -O "$TMP_DOWNLOAD_DIR/$distributionUrlName" || die "wget: Failed to fetch $distributionUrl"
elif [ -z "${MVNW_USERNAME-}" ] && command -v curl >/dev/null; then
  verbose "Found curl ... using curl"
  curl ${__MVNW_QUIET_CURL:+"$__MVNW_QUIET_CURL"} -f -L -o "$TMP_DOWNLOAD_DIR/$distributionUrlName" "$distributionUrl" || die "curl: Failed to fetch $distributionUrl"
elif set_java_home; then
  verbose "Falling back to use Java to download"
  javaSource="$TMP_DOWNLOAD_DIR/Downloader.java"
  targetZip="$TMP_DOWNLOAD_DIR/$distributionUrlName"
  cat >"$javaSource" <<-END
	public class Downloader extends java.net.Authenticator
	{
	  protected java.net.PasswordAuthentication getPasswordAuthentication()
	  {
	    return new java.net.PasswordAuthentication( System.getenv( "MVNW_USERNAME" ), System.getenv( "MVNW_PASSWORD" ).toCharArray() );
	  }
	  public static void main( String[] args ) throws Exception
	  {
	    setDefault( new Downloader() );
	    java.nio.file.Files.copy( java.net.URI.create( args[0] ).toURL().openStream(), java.nio.file.Paths.get( args[1] ).toAbsolutePath().normalize() );
	  }
	}
	END
  # For Cygwin/MinGW, switch paths to Windows format before running javac and java
  verbose " - Compiling Downloader.java ..."
  "$(native_path "$JAVACCMD")" "$(native_path "$javaSource")" || die "Failed to compile Downloader.java"
  verbose " - Running Downloader.java ..."
  "$(native_path "$JAVACMD")" -cp "$(native_path "$TMP_DOWNLOAD_DIR")" Downloader "$distributionUrl" "$(native_path "$targetZip")"
fi

# If specified, validate the SHA-256 sum of the Maven distribution zip file
if [ -n "${distributionSha256Sum-}" ]; then
  distributionSha256Result=false
  if [ "$MVN_CMD" = mvnd.sh ]; then
    echo "Checksum validation is not supported for maven-mvnd." >&2
    echo "Please disable validation by removing 'distributionSha256Sum' from your maven-wrapper.properties." >&2
    exit 1
  elif command -v sha256sum >/dev/null; then
    if echo "$distributionSha256Sum  $TMP_DOWNLOAD_DIR/$distributionUrlName" | sha256sum -c - >/dev/null 2>&1; then
      distributionSha256Result=true
    fi
  elif command -v shasum >/dev/null; then
    if echo "$distributionSha256Sum  $TMP_DOWNLOAD_DIR/$distributionUrlName" | shasum -a 256 -c >/dev/null 2>&1; then
      distributionSha256Result=true
    fi
  else
    echo "Checksum validation was requested but neither 'sha256sum' or 'shasum' are available." >&2
    echo "Please install either command, or disable validation by removing 'distributionSha256Sum' from your maven-wrapper.properties." >&2
    exit 1
  fi
  if [ $distributionSha256Result = false ]; then
    echo "Error: Failed to validate Maven distribution SHA-256, your Maven distribution might be compromised." >&2
    echo "If you updated your Maven version, you need to update the specified distributionSha256Sum property." >&2
    exit 1
  fi
fi

# unzip and move
if command -v unzip >/dev/null; then
  unzip ${__MVNW_QUIET_UNZIP:+"$__MVNW_QUIET_UNZIP"} "$TMP_DOWNLOAD_DIR/$distributionUrlName" -d "$TMP_DOWNLOAD_DIR" || die "failed to unzip"
else
  tar xzf${__MVNW_QUIET_TAR:+"$__MVNW_QUIET_TAR"} "$TMP_DOWNLOAD_DIR/$distributionUrlName" -C "$TMP_DOWNLOAD_DIR" || die "failed to untar"
fi

# Find the actual extracted directory name (handles snapshots where filename != directory name)
actualDistributionDir=""

# First try the expected directory name (for regular distributions)
if [ -d "$TMP_DOWNLOAD_DIR/$distributionUrlNameMain" ]; then
  if [ -f "$TMP_DOWNLOAD_DIR/$distributionUrlNameMain/bin/$MVN_CMD" ]; then
    actualDistributionDir="$distributionUrlNameMain"
  fi
fi

# If not found, search for any directory with the Maven executable (for snapshots)
if [ -z "$actualDistributionDir" ]; then
  # enable globbing to iterate over items
  set +f
  for dir in "$TMP_DOWNLOAD_DIR"/*; do
    if [ -d "$dir" ]; then
      if [ -f "$dir/bin/$MVN_CMD" ]; then
        actualDistributionDir="$(basename "$dir")"
        break
      fi
    fi
  done
  set -f
fi

if [ -z "$actualDistributionDir" ]; then
  verbose "Contents of $TMP_DOWNLOAD_DIR:"
  verbose "$(ls -la "$TMP_DOWNLOAD_DIR")"
  die "Could not find Maven distribution directory in extracted archive"
fi

verbose "Found extracted Maven distribution directory: $actualDistributionDir"
printf %s\\n "$distributionUrl" >"$TMP_DOWNLOAD_DIR/$actualDistributionDir/mvnw.url"
mv -- "$TMP_DOWNLOAD_DIR/$actualDistributionDir" "$MAVEN_HOME" || [ -d "$MAVEN_HOME" ] || die "fail to move MAVEN_HOME"

clean || :
exec_maven "$@"


---


<ruta> .\mvnw.cmd
---
<# : batch portion
@REM ----------------------------------------------------------------------------
@REM Licensed to the Apache Software Foundation (ASF) under one
@REM or more contributor license agreements.  See the NOTICE file
@REM distributed with this work for additional information
@REM regarding copyright ownership.  The ASF licenses this file
@REM to you under the Apache License, Version 2.0 (the
@REM "License"); you may not use this file except in compliance
@REM with the License.  You may obtain a copy of the License at
@REM
@REM    http://www.apache.org/licenses/LICENSE-2.0
@REM
@REM Unless required by applicable law or agreed to in writing,
@REM software distributed under the License is distributed on an
@REM "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
@REM KIND, either express or implied.  See the License for the
@REM specific language governing permissions and limitations
@REM under the License.
@REM ----------------------------------------------------------------------------

@REM ----------------------------------------------------------------------------
@REM Apache Maven Wrapper startup batch script, version 3.3.4
@REM
@REM Optional ENV vars
@REM   MVNW_REPOURL - repo url base for downloading maven distribution
@REM   MVNW_USERNAME/MVNW_PASSWORD - user and password for downloading maven
@REM   MVNW_VERBOSE - true: enable verbose log; others: silence the output
@REM ----------------------------------------------------------------------------

@IF "%__MVNW_ARG0_NAME__%"=="" (SET __MVNW_ARG0_NAME__=%~nx0)
@SET __MVNW_CMD__=
@SET __MVNW_ERROR__=
@SET __MVNW_PSMODULEP_SAVE=%PSModulePath%
@SET PSModulePath=
@FOR /F "usebackq tokens=1* delims==" %%A IN (`powershell -noprofile "& {$scriptDir='%~dp0'; $script='%__MVNW_ARG0_NAME__%'; icm -ScriptBlock ([Scriptblock]::Create((Get-Content -Raw '%~f0'))) -NoNewScope}"`) DO @(
  IF "%%A"=="MVN_CMD" (set __MVNW_CMD__=%%B) ELSE IF "%%B"=="" (echo %%A) ELSE (echo %%A=%%B)
)
@SET PSModulePath=%__MVNW_PSMODULEP_SAVE%
@SET __MVNW_PSMODULEP_SAVE=
@SET __MVNW_ARG0_NAME__=
@SET MVNW_USERNAME=
@SET MVNW_PASSWORD=
@IF NOT "%__MVNW_CMD__%"=="" ("%__MVNW_CMD__%" %*)
@echo Cannot start maven from wrapper >&2 && exit /b 1
@GOTO :EOF
: end batch / begin powershell #>

$ErrorActionPreference = "Stop"
if ($env:MVNW_VERBOSE -eq "true") {
  $VerbosePreference = "Continue"
}

# calculate distributionUrl, requires .mvn/wrapper/maven-wrapper.properties
$distributionUrl = (Get-Content -Raw "$scriptDir/.mvn/wrapper/maven-wrapper.properties" | ConvertFrom-StringData).distributionUrl
if (!$distributionUrl) {
  Write-Error "cannot read distributionUrl property in $scriptDir/.mvn/wrapper/maven-wrapper.properties"
}

switch -wildcard -casesensitive ( $($distributionUrl -replace '^.*/','') ) {
  "maven-mvnd-*" {
    $USE_MVND = $true
    $distributionUrl = $distributionUrl -replace '-bin\.[^.]*$',"-windows-amd64.zip"
    $MVN_CMD = "mvnd.cmd"
    break
  }
  default {
    $USE_MVND = $false
    $MVN_CMD = $script -replace '^mvnw','mvn'
    break
  }
}

# apply MVNW_REPOURL and calculate MAVEN_HOME
# maven home pattern: ~/.m2/wrapper/dists/{apache-maven-<version>,maven-mvnd-<version>-<platform>}/<hash>
if ($env:MVNW_REPOURL) {
  $MVNW_REPO_PATTERN = if ($USE_MVND -eq $False) { "/org/apache/maven/" } else { "/maven/mvnd/" }
  $distributionUrl = "$env:MVNW_REPOURL$MVNW_REPO_PATTERN$($distributionUrl -replace "^.*$MVNW_REPO_PATTERN",'')"
}
$distributionUrlName = $distributionUrl -replace '^.*/',''
$distributionUrlNameMain = $distributionUrlName -replace '\.[^.]*$','' -replace '-bin$',''

$MAVEN_M2_PATH = "$HOME/.m2"
if ($env:MAVEN_USER_HOME) {
  $MAVEN_M2_PATH = "$env:MAVEN_USER_HOME"
}

if (-not (Test-Path -Path $MAVEN_M2_PATH)) {
    New-Item -Path $MAVEN_M2_PATH -ItemType Directory | Out-Null
}

$MAVEN_WRAPPER_DISTS = $null
if ((Get-Item $MAVEN_M2_PATH).Target[0] -eq $null) {
  $MAVEN_WRAPPER_DISTS = "$MAVEN_M2_PATH/wrapper/dists"
} else {
  $MAVEN_WRAPPER_DISTS = (Get-Item $MAVEN_M2_PATH).Target[0] + "/wrapper/dists"
}

$MAVEN_HOME_PARENT = "$MAVEN_WRAPPER_DISTS/$distributionUrlNameMain"
$MAVEN_HOME_NAME = ([System.Security.Cryptography.SHA256]::Create().ComputeHash([byte[]][char[]]$distributionUrl) | ForEach-Object {$_.ToString("x2")}) -join ''
$MAVEN_HOME = "$MAVEN_HOME_PARENT/$MAVEN_HOME_NAME"

if (Test-Path -Path "$MAVEN_HOME" -PathType Container) {
  Write-Verbose "found existing MAVEN_HOME at $MAVEN_HOME"
  Write-Output "MVN_CMD=$MAVEN_HOME/bin/$MVN_CMD"
  exit $?
}

if (! $distributionUrlNameMain -or ($distributionUrlName -eq $distributionUrlNameMain)) {
  Write-Error "distributionUrl is not valid, must end with *-bin.zip, but found $distributionUrl"
}

# prepare tmp dir
$TMP_DOWNLOAD_DIR_HOLDER = New-TemporaryFile
$TMP_DOWNLOAD_DIR = New-Item -Itemtype Directory -Path "$TMP_DOWNLOAD_DIR_HOLDER.dir"
$TMP_DOWNLOAD_DIR_HOLDER.Delete() | Out-Null
trap {
  if ($TMP_DOWNLOAD_DIR.Exists) {
    try { Remove-Item $TMP_DOWNLOAD_DIR -Recurse -Force | Out-Null }
    catch { Write-Warning "Cannot remove $TMP_DOWNLOAD_DIR" }
  }
}

New-Item -Itemtype Directory -Path "$MAVEN_HOME_PARENT" -Force | Out-Null

# Download and Install Apache Maven
Write-Verbose "Couldn't find MAVEN_HOME, downloading and installing it ..."
Write-Verbose "Downloading from: $distributionUrl"
Write-Verbose "Downloading to: $TMP_DOWNLOAD_DIR/$distributionUrlName"

$webclient = New-Object System.Net.WebClient
if ($env:MVNW_USERNAME -and $env:MVNW_PASSWORD) {
  $webclient.Credentials = New-Object System.Net.NetworkCredential($env:MVNW_USERNAME, $env:MVNW_PASSWORD)
}
[Net.ServicePointManager]::SecurityProtocol = [Net.SecurityProtocolType]::Tls12
$webclient.DownloadFile($distributionUrl, "$TMP_DOWNLOAD_DIR/$distributionUrlName") | Out-Null

# If specified, validate the SHA-256 sum of the Maven distribution zip file
$distributionSha256Sum = (Get-Content -Raw "$scriptDir/.mvn/wrapper/maven-wrapper.properties" | ConvertFrom-StringData).distributionSha256Sum
if ($distributionSha256Sum) {
  if ($USE_MVND) {
    Write-Error "Checksum validation is not supported for maven-mvnd. `nPlease disable validation by removing 'distributionSha256Sum' from your maven-wrapper.properties."
  }
  Import-Module $PSHOME\Modules\Microsoft.PowerShell.Utility -Function Get-FileHash
  if ((Get-FileHash "$TMP_DOWNLOAD_DIR/$distributionUrlName" -Algorithm SHA256).Hash.ToLower() -ne $distributionSha256Sum) {
    Write-Error "Error: Failed to validate Maven distribution SHA-256, your Maven distribution might be compromised. If you updated your Maven version, you need to update the specified distributionSha256Sum property."
  }
}

# unzip and move
Expand-Archive "$TMP_DOWNLOAD_DIR/$distributionUrlName" -DestinationPath "$TMP_DOWNLOAD_DIR" | Out-Null

# Find the actual extracted directory name (handles snapshots where filename != directory name)
$actualDistributionDir = ""

# First try the expected directory name (for regular distributions)
$expectedPath = Join-Path "$TMP_DOWNLOAD_DIR" "$distributionUrlNameMain"
$expectedMvnPath = Join-Path "$expectedPath" "bin/$MVN_CMD"
if ((Test-Path -Path $expectedPath -PathType Container) -and (Test-Path -Path $expectedMvnPath -PathType Leaf)) {
  $actualDistributionDir = $distributionUrlNameMain
}

# If not found, search for any directory with the Maven executable (for snapshots)
if (!$actualDistributionDir) {
  Get-ChildItem -Path "$TMP_DOWNLOAD_DIR" -Directory | ForEach-Object {
    $testPath = Join-Path $_.FullName "bin/$MVN_CMD"
    if (Test-Path -Path $testPath -PathType Leaf) {
      $actualDistributionDir = $_.Name
    }
  }
}

if (!$actualDistributionDir) {
  Write-Error "Could not find Maven distribution directory in extracted archive"
}

Write-Verbose "Found extracted Maven distribution directory: $actualDistributionDir"
Rename-Item -Path "$TMP_DOWNLOAD_DIR/$actualDistributionDir" -NewName $MAVEN_HOME_NAME | Out-Null
try {
  Move-Item -Path "$TMP_DOWNLOAD_DIR/$MAVEN_HOME_NAME" -Destination $MAVEN_HOME_PARENT | Out-Null
} catch {
  if (! (Test-Path -Path "$MAVEN_HOME" -PathType Container)) {
    Write-Error "fail to move MAVEN_HOME"
  }
} finally {
  try { Remove-Item $TMP_DOWNLOAD_DIR -Recurse -Force | Out-Null }
  catch { Write-Warning "Cannot remove $TMP_DOWNLOAD_DIR" }
}

Write-Output "MVN_CMD=$MAVEN_HOME/bin/$MVN_CMD"


---


<ruta> .\pom.xml
---
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
	<modelVersion>4.0.0</modelVersion>
	<parent>
		<groupId>org.springframework.boot</groupId>
		<artifactId>spring-boot-starter-parent</artifactId>
		<version>3.4.5</version>
		<relativePath />
	</parent>
	<groupId>com.proyecto</groupId>
	<artifactId>grupo09</artifactId>
	<version>0.0.1-SNAPSHOT</version>
	<name>grupo09</name>
	<description />
	<properties>
		<java.version>17</java.version>
		<project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
		<project.reporting.outputEncoding>UTF-8</project.reporting.outputEncoding>
	</properties>
	<dependencies>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-data-jpa</artifactId>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-thymeleaf</artifactId>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-web</artifactId>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-devtools</artifactId>
			<scope>runtime</scope>
			<optional>true</optional>
		</dependency>

		<dependency>
			<groupId>org.postgresql</groupId>
			<artifactId>postgresql</artifactId>
			<scope>runtime</scope>
		</dependency>

		<dependency>
			<groupId>org.projectlombok</groupId>
			<artifactId>lombok</artifactId>
			<optional>true</optional>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-test</artifactId>
			<scope>test</scope>
		</dependency>
	</dependencies>

	<build>
		<plugins>
			<plugin>
				<groupId>org.springframework.boot</groupId>
				<artifactId>spring-boot-maven-plugin</artifactId>
				<configuration>
					<excludes>
						<exclude>
							<groupId>org.projectlombok</groupId>
							<artifactId>lombok</artifactId>
						</exclude>
					</excludes>
				</configuration>
			</plugin>
			<plugin>
				<groupId>org.apache.maven.plugins</groupId>
				<artifactId>maven-compiler-plugin</artifactId>
				<executions>
					<execution>
						<id>default-compile</id>
						<phase>compile</phase>
						<goals>
							<goal>compile</goal>
						</goals>
						<configuration>
							<annotationProcessorPaths>
								<path>
									<groupId>org.projectlombok</groupId>
									<artifactId>lombok</artifactId>
								</path>
							</annotationProcessorPaths>
						</configuration>
					</execution>
					<execution>
						<id>default-testCompile</id>
						<phase>test-compile</phase>
						<goals>
							<goal>testCompile</goal>
						</goals>
						<configuration>
							<annotationProcessorPaths>
								<path>
									<groupId>org.projectlombok</groupId>
									<artifactId>lombok</artifactId>
								</path>
							</annotationProcessorPaths>
						</configuration>
					</execution>
				</executions>
			</plugin>
		</plugins>
	</build>
</project>

---


<ruta> .mvn\wrapper\maven-wrapper.properties
---
wrapperVersion=3.3.4
distributionType=only-script
distributionUrl=https://repo.maven.apache.org/maven2/org/apache/maven/apache-maven/3.9.14/apache-maven-3.9.14-bin.zip


---


<ruta> .settings\org.eclipse.core.resources.prefs
---
eclipse.preferences.version=1
encoding//src/main/java=UTF-8
encoding//src/main/resources=UTF-8
encoding//src/test/java=UTF-8
encoding//src/test/resources=UTF-8
encoding/<project>=UTF-8


---


<ruta> .settings\org.eclipse.jdt.apt.core.prefs
---
eclipse.preferences.version=1
org.eclipse.jdt.apt.aptEnabled=true
org.eclipse.jdt.apt.genSrcDir=target/generated-sources/annotations
org.eclipse.jdt.apt.genTestSrcDir=target/generated-test-sources/test-annotations


---


<ruta> .settings\org.eclipse.jdt.core.prefs
---
eclipse.preferences.version=1
org.eclipse.jdt.core.compiler.codegen.methodParameters=generate
org.eclipse.jdt.core.compiler.codegen.targetPlatform=17
org.eclipse.jdt.core.compiler.compliance=17
org.eclipse.jdt.core.compiler.problem.enablePreviewFeatures=disabled
org.eclipse.jdt.core.compiler.problem.forbiddenReference=warning
org.eclipse.jdt.core.compiler.problem.reportPreviewFeatures=ignore
org.eclipse.jdt.core.compiler.processAnnotations=enabled
org.eclipse.jdt.core.compiler.release=enabled
org.eclipse.jdt.core.compiler.source=17


---


<ruta> .settings\org.springframework.ide.eclipse.prefs
---
boot.validation.initialized=true
eclipse.preferences.version=1


---


<ruta> .\src\main\java\com\proyecto\PI09\Grupo09Application.java
---
package com.proyecto.PI09;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Grupo09Application {

	public static void main(String[] args) {
		SpringApplication.run(Grupo09Application.class, args);
	}

}


---


<ruta> .\src\main\java\com\proyecto\PI09\config\WatsonProperties.java
---
package com.proyecto.PI09.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix = "watson")
public class WatsonProperties {

    private String url;
    private Color color = new Color();

    @Data
    public static class Color {
        private String primary = "#0f62fe";
        private String primaryHover = "#0353e9";
        private String bgLight = "#ffffff";
        private String bgDark = "#f4f4f4";
        private String textPrimary = "#161616";
        private String textSecondary = "#525252";
        private String border = "#e0e0e0";
        private String badge = "#e81818";
    }
}

---


<ruta> .\src\main\java\com\proyecto\PI09\controller\AdminController.java
---
package com.proyecto.PI09.controller;

import java.util.List;
import java.util.Optional;

import com.proyecto.PI09.model.Alternativa;
import com.proyecto.PI09.model.Pregunta;
import com.proyecto.PI09.model.Simulacion;
import com.proyecto.PI09.service.AlternativaService;
import com.proyecto.PI09.service.PreguntaService;
import com.proyecto.PI09.service.SimulacionService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private SimulacionService simulacionService;

    @Autowired
    private PreguntaService preguntaService;

    @Autowired
    private AlternativaService alternativaService;

    @GetMapping("/dashboard")
    public String dashboard(Model model) {
        List<Simulacion> simulaciones = simulacionService.listarTodas();
        model.addAttribute("simulaciones", simulaciones);
        return "dashboard";
    }

    @GetMapping("/simulacion/{id}/preguntas")
    public String verPreguntas(@PathVariable Integer id, Model model) {
        Optional<Simulacion> simulacionOpt = simulacionService.buscarPorId(id);

        if (simulacionOpt.isEmpty()) {
            return "redirect:/admin/dashboard";
        }

        Simulacion simulacion = simulacionOpt.get();
        List<Pregunta> preguntas = preguntaService.listarPorSimulacion(simulacion);

        model.addAttribute("simulacion", simulacion);
        model.addAttribute("preguntas", preguntas);
        return "admin-preguntas";
    }

    @GetMapping("/simulacion/{id}/preguntas/nueva")
    public String nuevaPregunta(@PathVariable Integer id, Model model) {
        Optional<Simulacion> simulacionOpt = simulacionService.buscarPorId(id);

        if (simulacionOpt.isEmpty()) {
            return "redirect:/admin/dashboard";
        }

        model.addAttribute("simulacion", simulacionOpt.get());
        model.addAttribute("pregunta", new Pregunta());
        model.addAttribute("modo", "crear");
        return "admin-pregunta-form";
    }

    @PostMapping("/simulacion/{id}/preguntas/guardar")
    public String guardarPregunta(@PathVariable Integer id,
                                  @RequestParam String texto,
                                  @RequestParam(defaultValue = "0") Integer orden,
                                  @RequestParam(defaultValue = "false") Boolean esInicial,
                                  @RequestParam(defaultValue = "false") Boolean esFinal) {

        Optional<Simulacion> simulacionOpt = simulacionService.buscarPorId(id);

        if (simulacionOpt.isEmpty()) {
            return "redirect:/admin/dashboard";
        }

        Pregunta pregunta = new Pregunta();
        pregunta.setSimulacion(simulacionOpt.get());
        pregunta.setTexto(texto);
        pregunta.setOrden(orden);
        pregunta.setEsInicial(esInicial);
        pregunta.setEsFinal(esFinal);
        pregunta.setEstado(true);

        preguntaService.guardar(pregunta);

        return "redirect:/admin/simulacion/" + id + "/preguntas";
    }

    @GetMapping("/pregunta/{id}/editar")
    public String editarPregunta(@PathVariable Integer id, Model model) {
        Optional<Pregunta> preguntaOpt = preguntaService.buscarPorId(id);

        if (preguntaOpt.isEmpty()) {
            return "redirect:/admin/dashboard";
        }

        Pregunta pregunta = preguntaOpt.get();
        model.addAttribute("simulacion", pregunta.getSimulacion());
        model.addAttribute("pregunta", pregunta);
        model.addAttribute("modo", "editar");
        return "admin-pregunta-form";
    }

    @PostMapping("/pregunta/{id}/actualizar")
    public String actualizarPregunta(@PathVariable Integer id,
                                     @RequestParam String texto,
                                     @RequestParam(defaultValue = "0") Integer orden,
                                     @RequestParam(defaultValue = "false") Boolean esInicial,
                                     @RequestParam(defaultValue = "false") Boolean esFinal) {

        Optional<Pregunta> preguntaOpt = preguntaService.buscarPorId(id);

        if (preguntaOpt.isEmpty()) {
            return "redirect:/admin/dashboard";
        }

        Pregunta pregunta = preguntaOpt.get();
        pregunta.setTexto(texto);
        pregunta.setOrden(orden);
        pregunta.setEsInicial(esInicial);
        pregunta.setEsFinal(esFinal);

        preguntaService.guardar(pregunta);

        return "redirect:/admin/simulacion/" + pregunta.getSimulacion().getIdSimulacion() + "/preguntas";
    }

    @GetMapping("/pregunta/{id}/desactivar")
    public String desactivarPregunta(@PathVariable Integer id) {
        Optional<Pregunta> preguntaOpt = preguntaService.buscarPorId(id);

        if (preguntaOpt.isEmpty()) {
            return "redirect:/admin/dashboard";
        }

        Integer idSimulacion = preguntaOpt.get().getSimulacion().getIdSimulacion();
        preguntaService.desactivar(id);

        return "redirect:/admin/simulacion/" + idSimulacion + "/preguntas";
    }

    @GetMapping("/pregunta/{id}/alternativas")
    public String verAlternativas(@PathVariable Integer id, Model model) {
        Optional<Pregunta> preguntaOpt = preguntaService.buscarPorId(id);

        if (preguntaOpt.isEmpty()) {
            return "redirect:/admin/dashboard";
        }

        Pregunta pregunta = preguntaOpt.get();
        List<Alternativa> alternativas = alternativaService.listarPorPregunta(pregunta);

        model.addAttribute("pregunta", pregunta);
        model.addAttribute("alternativas", alternativas);

        List<Pregunta> preguntasMismaSimulacion = preguntaService.listarPorSimulacion(pregunta.getSimulacion());
        model.addAttribute("preguntasSimulacion", preguntasMismaSimulacion);

        model.addAttribute("alternativa", new Alternativa());
        model.addAttribute("modo", "crear");

        return "admin-alternativas";
    }

    @PostMapping("/pregunta/{id}/alternativas/guardar")
    public String guardarAlternativa(@PathVariable Integer id,
                                     @RequestParam String texto,
                                     @RequestParam Integer puntaje,
                                     @RequestParam(required = false) Integer idSiguientePregunta) {

        Optional<Pregunta> preguntaOpt = preguntaService.buscarPorId(id);

        if (preguntaOpt.isEmpty()) {
            return "redirect:/admin/dashboard";
        }

        Pregunta pregunta = preguntaOpt.get();

        Alternativa alternativa = new Alternativa();
        alternativa.setPregunta(pregunta);
        alternativa.setTexto(texto);
        alternativa.setPuntaje(puntaje);
        alternativa.setEstado(true);

        if (idSiguientePregunta != null) {
            Optional<Pregunta> siguienteOpt = preguntaService.buscarPorId(idSiguientePregunta);
            siguienteOpt.ifPresent(alternativa::setSiguientePregunta);
        }

        alternativaService.guardar(alternativa);

        return "redirect:/admin/pregunta/" + id + "/alternativas";
    }

    @GetMapping("/alternativa/{id}/editar")
    public String editarAlternativa(@PathVariable Integer id, Model model) {
        Optional<Alternativa> alternativaOpt = alternativaService.buscarPorId(id);

        if (alternativaOpt.isEmpty()) {
            return "redirect:/admin/dashboard";
        }

        Alternativa alternativa = alternativaOpt.get();
        Pregunta pregunta = alternativa.getPregunta();

        model.addAttribute("pregunta", pregunta);
        model.addAttribute("alternativas", alternativaService.listarPorPregunta(pregunta));
        model.addAttribute("preguntasSimulacion", preguntaService.listarPorSimulacion(pregunta.getSimulacion()));
        model.addAttribute("alternativa", alternativa);
        model.addAttribute("modo", "editar");

        return "admin-alternativas";
    }

    @PostMapping("/alternativa/{id}/actualizar")
    public String actualizarAlternativa(@PathVariable Integer id,
                                        @RequestParam String texto,
                                        @RequestParam Integer puntaje,
                                        @RequestParam(required = false) Integer idSiguientePregunta) {

        Optional<Alternativa> alternativaOpt = alternativaService.buscarPorId(id);

        if (alternativaOpt.isEmpty()) {
            return "redirect:/admin/dashboard";
        }

        Alternativa alternativa = alternativaOpt.get();
        alternativa.setTexto(texto);
        alternativa.setPuntaje(puntaje);

        if (idSiguientePregunta != null) {
            Optional<Pregunta> siguienteOpt = preguntaService.buscarPorId(idSiguientePregunta);
            alternativa.setSiguientePregunta(siguienteOpt.orElse(null));
        } else {
            alternativa.setSiguientePregunta(null);
        }

        alternativaService.guardar(alternativa);

        return "redirect:/admin/pregunta/" + alternativa.getPregunta().getIdPregunta() + "/alternativas";
    }

    @GetMapping("/alternativa/{id}/desactivar")
    public String desactivarAlternativa(@PathVariable Integer id) {
        Optional<Alternativa> alternativaOpt = alternativaService.buscarPorId(id);

        if (alternativaOpt.isEmpty()) {
            return "redirect:/admin/dashboard";
        }

        Integer idPregunta = alternativaOpt.get().getPregunta().getIdPregunta();
        alternativaService.desactivar(id);

        return "redirect:/admin/pregunta/" + idPregunta + "/alternativas";
    }
}

---


<ruta> .\src\main\java\com\proyecto\PI09\controller\SimulacionController.java
---
package com.proyecto.PI09.controller;

import java.util.List;
import java.util.Optional;

import com.proyecto.PI09.model.Alternativa;
import com.proyecto.PI09.model.Pregunta;
import com.proyecto.PI09.model.Simulacion;
import com.proyecto.PI09.service.AlternativaService;
import com.proyecto.PI09.service.PreguntaService;
import com.proyecto.PI09.service.SimulacionService;

import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class SimulacionController {

    @Autowired
    private SimulacionService simulacionService;

    @Autowired
    private PreguntaService preguntaService;

    @Autowired
    private AlternativaService alternativaService;

    @GetMapping("/simulacion")
    public String verSimulacion(Model model) {
        List<Simulacion> simulaciones = simulacionService.listarTodas();
        model.addAttribute("simulaciones", simulaciones);
        return "preguntas-publico";
    }

    @GetMapping("/simulacion/{id}/iniciar")
    public String iniciarSimulacion(@PathVariable Integer id, HttpSession session) {
        Optional<Simulacion> simulacionOpt = simulacionService.buscarPorId(id);

        if (simulacionOpt.isEmpty()) {
            return "redirect:/simulacion";
        }

        Simulacion simulacion = simulacionOpt.get();
        Optional<Pregunta> preguntaInicialOpt = preguntaService.buscarPreguntaInicial(simulacion);

        if (preguntaInicialOpt.isEmpty()) {
            return "redirect:/simulacion?sinPreguntas";
        }

        session.setAttribute("puntajeTotal", 0);
        session.setAttribute("idSimulacionActual", simulacion.getIdSimulacion());

        return "redirect:/simulacion/pregunta/" + preguntaInicialOpt.get().getIdPregunta();
    }

    @GetMapping("/simulacion/pregunta/{idPregunta}")
    public String mostrarPregunta(@PathVariable Integer idPregunta, Model model, HttpSession session) {
        Optional<Pregunta> preguntaOpt = preguntaService.buscarPorId(idPregunta);

        if (preguntaOpt.isEmpty()) {
            return "redirect:/simulacion";
        }

        Pregunta pregunta = preguntaOpt.get();
        List<Alternativa> alternativas = alternativaService.listarPorPregunta(pregunta);

        model.addAttribute("pregunta", pregunta);
        model.addAttribute("alternativas", alternativas);

        Object puntaje = session.getAttribute("puntajeTotal");
        model.addAttribute("puntajeTotal", puntaje == null ? 0 : puntaje);

        return "pregunta";
    }

    @PostMapping("/simulacion/responder")
    public String responderPregunta(@RequestParam Integer idAlternativa, HttpSession session) {
        Optional<Alternativa> alternativaOpt = alternativaService.buscarPorId(idAlternativa);

        if (alternativaOpt.isEmpty()) {
            return "redirect:/simulacion";
        }

        Alternativa alternativa = alternativaOpt.get();

        Integer puntajeActual = (Integer) session.getAttribute("puntajeTotal");
        if (puntajeActual == null) {
            puntajeActual = 0;
        }

        puntajeActual += alternativa.getPuntaje();
        session.setAttribute("puntajeTotal", puntajeActual);

        if (alternativa.getSiguientePregunta() == null) {
            return "redirect:/simulacion/resultado";
        }

        return "redirect:/simulacion/pregunta/" + alternativa.getSiguientePregunta().getIdPregunta();
    }

    @GetMapping("/simulacion/resultado")
    public String mostrarResultado(Model model, HttpSession session) {
        Integer puntajeTotal = (Integer) session.getAttribute("puntajeTotal");

        if (puntajeTotal == null) {
            puntajeTotal = 0;
        }

        model.addAttribute("puntajeTotal", puntajeTotal);

        if (puntajeTotal <= 10) {
            model.addAttribute("mensaje", "Tu enfoque estÃ¡ orientado principalmente al precio.");
        } else if (puntajeTotal <= 17) {
            model.addAttribute("mensaje", "Tu enfoque busca equilibrio entre costo y valor.");
        } else {
            model.addAttribute("mensaje", "Tu enfoque estÃ¡ orientado a calidad y confianza.");
        }

        return "resultado";
    }
}

---


<ruta> .\src\main\java\com\proyecto\PI09\controller\UsuarioController.java
---
package com.proyecto.PI09.controller;

import com.proyecto.PI09.model.Usuario;
import com.proyecto.PI09.service.UsuarioService;

import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/")
    public String inicio() {
        return "redirect:/login";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @PostMapping("/login")
    public String acceder(@RequestParam String correo,
                          @RequestParam String password,
                          HttpSession session) {

        Usuario user = usuarioService.validarLogin(correo, password);

        if (user != null) {
            session.setAttribute("usuarioLogueado", user);

            if ("ADMIN".equalsIgnoreCase(user.getRol().getNombreRol())) {
                return "redirect:/admin/dashboard";
            } else {
                return "redirect:/simulacion";
            }
        }

        return "redirect:/login?error";
    }

    @GetMapping("/registro")
    public String registro() {
        return "registro";
    }

    @PostMapping("/registro")
    public String guardarRegistro(@RequestParam String nombre,
                                  @RequestParam String apellido,
                                  @RequestParam String correo,
                                  @RequestParam String password) {

        String resultado = usuarioService.registrarUsuario(nombre, apellido, correo, password);

        if ("CORREO_INVALIDO".equals(resultado)) {
            return "redirect:/registro?errorCorreo";
        }

        if ("CORREO_EXISTENTE".equals(resultado)) {
            return "redirect:/registro?correoExiste";
        }

        if ("ROL_NO_EXISTE".equals(resultado)) {
            return "redirect:/registro?errorRol";
        }

        return "redirect:/login?registroExitoso";
    }

    @GetMapping("/logout")
    public String salir(HttpSession session) {
        session.invalidate();
        return "redirect:/login";
    }
}

---


<ruta> .\src\main\java\com\proyecto\PI09\controller\WatsonController.java
---
package com.proyecto.PI09.controller;

import com.proyecto.PI09.config.WatsonProperties;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/watson")
public class WatsonController {

    private final WatsonProperties watsonProperties;

    public WatsonController(WatsonProperties watsonProperties) {
        this.watsonProperties = watsonProperties;
    }

    @GetMapping("/config")
    public ResponseEntity<Map<String, String>> getConfig() {
        WatsonProperties.Color c = watsonProperties.getColor();
        return ResponseEntity.ok(Map.of(
            "watsonUrl",      watsonProperties.getUrl(),
            "primary",        c.getPrimary(),
            "primaryHover",   c.getPrimaryHover(),
            "bgLight",        c.getBgLight(),
            "bgDark",         c.getBgDark(),
            "textPrimary",    c.getTextPrimary(),
            "textSecondary",  c.getTextSecondary(),
            "border",         c.getBorder(),
            "badge",          c.getBadge()
        ));
    }
}

---


<ruta> .\src\main\java\com\proyecto\PI09\model\Alternativa.java
---
package com.proyecto.PI09.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;

@Entity
@Table(name = "alternativa")
public class Alternativa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_alternativa")
    private Integer idAlternativa;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_pregunta", nullable = false)
    private Pregunta pregunta;

    @Column(name = "texto", nullable = false, length = 255)
    private String texto;

    @Column(name = "puntaje", nullable = false)
    private Integer puntaje;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_siguiente_pregunta")
    private Pregunta siguientePregunta;

    @Column(name = "estado", nullable = false)
    private Boolean estado;

    @Column(name = "fecha_creacion", nullable = false)
    private LocalDateTime fechaCreacion;

    public Alternativa() {
    }

    @PrePersist
    public void prePersist() {
        if (fechaCreacion == null) {
            fechaCreacion = LocalDateTime.now();
        }
        if (estado == null) {
            estado = true;
        }
        if (puntaje == null) {
            puntaje = 0;
        }
    }

    public Integer getIdAlternativa() {
        return idAlternativa;
    }

    public void setIdAlternativa(Integer idAlternativa) {
        this.idAlternativa = idAlternativa;
    }

    public Pregunta getPregunta() {
        return pregunta;
    }

    public void setPregunta(Pregunta pregunta) {
        this.pregunta = pregunta;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public Integer getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(Integer puntaje) {
        this.puntaje = puntaje;
    }

    public Pregunta getSiguientePregunta() {
        return siguientePregunta;
    }

    public void setSiguientePregunta(Pregunta siguientePregunta) {
        this.siguientePregunta = siguientePregunta;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public LocalDateTime getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDateTime fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
}

---


<ruta> .\src\main\java\com\proyecto\PI09\model\IntentoSimulacion.java
---
package com.proyecto.PI09.model;

public class IntentoSimulacion {

}


---


<ruta> .\src\main\java\com\proyecto\PI09\model\Perfil.java
---
package com.proyecto.PI09.model;

public class Perfil {

}


---


<ruta> .\src\main\java\com\proyecto\PI09\model\Pregunta.java
---
package com.proyecto.PI09.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;

@Entity
@Table(name = "pregunta")
public class Pregunta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pregunta")
    private Integer idPregunta;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_simulacion", nullable = false)
    private Simulacion simulacion;

    @Column(name = "texto", nullable = false, length = 255)
    private String texto;

    @Column(name = "orden")
    private Integer orden;

    @Column(name = "es_inicial", nullable = false)
    private Boolean esInicial;

    @Column(name = "es_final", nullable = false)
    private Boolean esFinal;

    @Column(name = "estado", nullable = false)
    private Boolean estado;

    @Column(name = "fecha_creacion", nullable = false)
    private LocalDateTime fechaCreacion;

    public Pregunta() {
    }

    @PrePersist
    public void prePersist() {
        if (fechaCreacion == null) {
            fechaCreacion = LocalDateTime.now();
        }
        if (estado == null) {
            estado = true;
        }
        if (esInicial == null) {
            esInicial = false;
        }
        if (esFinal == null) {
            esFinal = false;
        }
    }

    public Integer getIdPregunta() {
        return idPregunta;
    }

    public void setIdPregunta(Integer idPregunta) {
        this.idPregunta = idPregunta;
    }

    public Simulacion getSimulacion() {
        return simulacion;
    }

    public void setSimulacion(Simulacion simulacion) {
        this.simulacion = simulacion;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public Integer getOrden() {
        return orden;
    }

    public void setOrden(Integer orden) {
        this.orden = orden;
    }

    public Boolean getEsInicial() {
        return esInicial;
    }

    public void setEsInicial(Boolean esInicial) {
        this.esInicial = esInicial;
    }

    public Boolean getEsFinal() {
        return esFinal;
    }

    public void setEsFinal(Boolean esFinal) {
        this.esFinal = esFinal;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public LocalDateTime getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDateTime fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
}

---


<ruta> .\src\main\java\com\proyecto\PI09\model\RespuestaUsuario.java
---
package com.proyecto.PI09.model;

public class RespuestaUsuario {

}


---


<ruta> .\src\main\java\com\proyecto\PI09\model\ResultadoFinal.java
---
package com.proyecto.PI09.model;

public class ResultadoFinal {

}


---


<ruta> .\src\main\java\com\proyecto\PI09\model\Rol.java
---
package com.proyecto.PI09.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "rol")
public class Rol {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_rol")
    private Integer idRol;

    @Column(name = "nombre_rol", nullable = false, unique = true, length = 30)
    private String nombreRol;

    public Rol() {
    }

    public Integer getIdRol() {
        return idRol;
    }

    public void setIdRol(Integer idRol) {
        this.idRol = idRol;
    }

    public String getNombreRol() {
        return nombreRol;
    }

    public void setNombreRol(String nombreRol) {
        this.nombreRol = nombreRol;
    }
}

---


<ruta> .\src\main\java\com\proyecto\PI09\model\Simulacion.java
---
package com.proyecto.PI09.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;

@Entity
@Table(name = "simulacion")
public class Simulacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_simulacion")
    private Integer idSimulacion;

    @Column(name = "titulo", nullable = false, length = 150)
    private String titulo;

    @Column(name = "descripcion", length = 255)
    private String descripcion;

    @Column(name = "estado", nullable = false)
    private Boolean estado;

    @Column(name = "fecha_creacion", nullable = false)
    private LocalDateTime fechaCreacion;

    public Simulacion() {
    }

    @PrePersist
    public void prePersist() {
        if (fechaCreacion == null) {
            fechaCreacion = LocalDateTime.now();
        }
        if (estado == null) {
            estado = true;
        }
    }

    public Integer getIdSimulacion() {
        return idSimulacion;
    }

    public void setIdSimulacion(Integer idSimulacion) {
        this.idSimulacion = idSimulacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public LocalDateTime getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDateTime fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
}

---


<ruta> .\src\main\java\com\proyecto\PI09\model\Usuario.java
---
package com.proyecto.PI09.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import jakarta.persistence.Table;
import jakarta.persistence.Entity;

@Entity
@Table(name = "usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario")
    private Integer idUsuario;

    @Column(name = "nombre", nullable = false, length = 60)
    private String nombre;

    @Column(name = "apellido", nullable = false, length = 60)
    private String apellido;

    @Column(name = "correo", nullable = false, unique = true, length = 100)
    private String correo;

    @Column(name = "password", nullable = false, length = 255)
    private String password;

    @Column(name = "estado", nullable = false)
    private Boolean estado;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_rol", nullable = false)
    private Rol rol;

    @Column(name = "fecha_registro", nullable = false)
    private LocalDateTime fechaRegistro;

    public Usuario() {
    }

    @PrePersist
    public void prePersist() {
        if (fechaRegistro == null) {
            fechaRegistro = LocalDateTime.now();
        }
        if (estado == null) {
            estado = true;
        }
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public LocalDateTime getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(LocalDateTime fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
}

---


<ruta> .\src\main\java\com\proyecto\PI09\repository\AlternativaRepository.java
---
package com.proyecto.PI09.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proyecto.PI09.model.Alternativa;
import com.proyecto.PI09.model.Pregunta;

public interface AlternativaRepository extends JpaRepository<Alternativa, Integer> {

    List<Alternativa> findByPreguntaAndEstadoTrue(Pregunta pregunta);
}

---


<ruta> .\src\main\java\com\proyecto\PI09\repository\IntentoSimulacionRepository.java
---
package com.proyecto.PI09.repository;

public interface IntentoSimulacionRepository {

}


---


<ruta> .\src\main\java\com\proyecto\PI09\repository\PreguntaRepository.java
---
package com.proyecto.PI09.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proyecto.PI09.model.Pregunta;
import com.proyecto.PI09.model.Simulacion;

public interface PreguntaRepository extends JpaRepository<Pregunta, Integer> {

    List<Pregunta> findBySimulacionAndEstadoTrue(Simulacion simulacion);

    Optional<Pregunta> findBySimulacionAndEsInicialTrueAndEstadoTrue(Simulacion simulacion);
}

---


<ruta> .\src\main\java\com\proyecto\PI09\repository\RespuestaUsuarioRepository.java
---
package com.proyecto.PI09.repository;

public interface RespuestaUsuarioRepository {

}


---


<ruta> .\src\main\java\com\proyecto\PI09\repository\RolRepository.java
---
package com.proyecto.PI09.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proyecto.PI09.model.Rol;

public interface RolRepository extends JpaRepository<Rol, Integer> {
    Optional<Rol> findByNombreRol(String nombreRol);
}

---


<ruta> .\src\main\java\com\proyecto\PI09\repository\SimulacionRepository.java
---
package com.proyecto.PI09.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proyecto.PI09.model.Simulacion;

public interface SimulacionRepository extends JpaRepository<Simulacion, Integer> {
}

---


<ruta> .\src\main\java\com\proyecto\PI09\repository\UsuarioRepository.java
---
package com.proyecto.PI09.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proyecto.PI09.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
    Optional<Usuario> findByCorreo(String correo);
    Optional<Usuario> findByCorreoAndPassword(String correo, String password);
}

---


<ruta> .\src\main\java\com\proyecto\PI09\service\AlternativaService.java
---
package com.proyecto.PI09.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.PI09.model.Alternativa;
import com.proyecto.PI09.model.Pregunta;
import com.proyecto.PI09.repository.AlternativaRepository;

@Service
public class AlternativaService {

    @Autowired
    private AlternativaRepository alternativaRepository;

    public List<Alternativa> listarPorPregunta(Pregunta pregunta) {
        return alternativaRepository.findByPreguntaAndEstadoTrue(pregunta);
    }

    public Optional<Alternativa> buscarPorId(Integer id) {
        return alternativaRepository.findById(id);
    }

    public Alternativa guardar(Alternativa alternativa) {
        return alternativaRepository.save(alternativa);
    }

    public void desactivar(Integer id) {
        Optional<Alternativa> alternativaOpt = alternativaRepository.findById(id);
        if (alternativaOpt.isPresent()) {
            Alternativa alternativa = alternativaOpt.get();
            alternativa.setEstado(false);
            alternativaRepository.save(alternativa);
        }
    }
}

---


<ruta> .\src\main\java\com\proyecto\PI09\service\IntentoSimulacionService.java
---
package com.proyecto.PI09.service;

public class IntentoSimulacionService {

}


---


<ruta> .\src\main\java\com\proyecto\PI09\service\PreguntaService.java
---
package com.proyecto.PI09.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.PI09.model.Pregunta;
import com.proyecto.PI09.model.Simulacion;
import com.proyecto.PI09.repository.PreguntaRepository;

@Service
public class PreguntaService {

    @Autowired
    private PreguntaRepository preguntaRepository;

    public List<Pregunta> listarPorSimulacion(Simulacion simulacion) {
        return preguntaRepository.findBySimulacionAndEstadoTrue(simulacion);
    }

    public Optional<Pregunta> buscarPorId(Integer id) {
        return preguntaRepository.findById(id);
    }

    public Optional<Pregunta> buscarPreguntaInicial(Simulacion simulacion) {
        return preguntaRepository.findBySimulacionAndEsInicialTrueAndEstadoTrue(simulacion);
    }

    public Pregunta guardar(Pregunta pregunta) {
        return preguntaRepository.save(pregunta);
    }

    public void desactivar(Integer id) {
        Optional<Pregunta> preguntaOpt = preguntaRepository.findById(id);
        if (preguntaOpt.isPresent()) {
            Pregunta pregunta = preguntaOpt.get();
            pregunta.setEstado(false);
            preguntaRepository.save(pregunta);
        }
    }
}

---


<ruta> .\src\main\java\com\proyecto\PI09\service\SimulacionService.java
---
package com.proyecto.PI09.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.PI09.model.Simulacion;
import com.proyecto.PI09.repository.SimulacionRepository;

@Service
public class SimulacionService {

    @Autowired
    private SimulacionRepository simulacionRepository;

    public List<Simulacion> listarTodas() {
        return simulacionRepository.findAll();
    }

    public Optional<Simulacion> buscarPorId(Integer id) {
        return simulacionRepository.findById(id);
    }

    public Simulacion guardar(Simulacion simulacion) {
        return simulacionRepository.save(simulacion);
    }
}

---


<ruta> .\src\main\java\com\proyecto\PI09\service\UsuarioService.java
---
package com.proyecto.PI09.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.PI09.model.Rol;
import com.proyecto.PI09.model.Usuario;
import com.proyecto.PI09.repository.RolRepository;
import com.proyecto.PI09.repository.UsuarioRepository;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private RolRepository rolRepository;

    public Optional<Usuario> buscarPorCorreo(String correo) {
        return usuarioRepository.findByCorreo(correo);
    }

    public Usuario guardar(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    public Usuario validarLogin(String correo, String password) {
        return usuarioRepository.findByCorreoAndPassword(correo, password).orElse(null);
    }

    public String registrarUsuario(String nombre, String apellido, String correo, String password) {
        if (correo == null || !correo.endsWith("@cibertec.edu.pe")) {
            return "CORREO_INVALIDO";
        }

        if (usuarioRepository.findByCorreo(correo).isPresent()) {
            return "CORREO_EXISTENTE";
        }

        Optional<Rol> rolOpt = rolRepository.findByNombreRol("USUARIO");
        if (rolOpt.isEmpty()) {
            return "ROL_NO_EXISTE";
        }

        Usuario usuario = new Usuario();
        usuario.setNombre(nombre);
        usuario.setApellido(apellido);
        usuario.setCorreo(correo);
        usuario.setPassword(password);
        usuario.setRol(rolOpt.get());
        usuario.setEstado(true);

        usuarioRepository.save(usuario);
        return "OK";
    }
}

---


<ruta> .\src\main\resources\application.properties
---
spring.application.name=grupo09

spring.datasource.url=jdbc:postgresql://localhost:5432/db_yachay
spring.datasource.username=postgres
spring.datasource.password=postgres
spring.datasource.driver-class-name=org.postgresql.Driver

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect

# Configuración Watson
watson.url=https://api.us-east.assistant.watson.cloud.ibm.com/instances/2749de81-1f26-4ac7-91f8-6d15d9613faf


watson.color.primary=#0f62fe
watson.color.primary-hover=#0353e9
watson.color.bg-light=#ffffff
watson.color.bg-dark=#f4f4f4
watson.color.text-primary=#161616
watson.color.text-secondary=#525252
watson.color.border=#e0e0e0
watson.color.badge=#e81818

---


<ruta> .\src\main\resources\application.properties.example
---
spring.application.name=grupo09

#spring.datasource.url=jdbc:mysql://localhost:3306/db_yachay
#spring.datasource.username=root
#spring.datasource.password=root
#spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
#
#spring.jpa.hibernate.ddl-auto=none
#spring.jpa.show-sql=true
#spring.jpa.properties.hibernate.format_sql=true
#spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLDialect

# Configuración de conexión para PostgreSQL
spring.datasource.url=jdbc:postgresql://localhost:5432/db_yachay
spring.datasource.username=postgres
spring.datasource.password=postgres
spring.datasource.driver-class-name=org.postgresql.Driver

# Configuración de JPA / Hibernate
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true

watson.url=https://api.us-east.assistant.watson.cloud.ibm.com/instances/2749de81-1f26-4ac7-91f8-6d15d9613faf

watson.color.primary=#0f62fe
watson.color.primary-hover=#0353e9
watson.color.bg-light=#ffffff
watson.color.bg-dark=#f4f4f4
watson.color.text-primary=#161616
watson.color.text-secondary=#525252
watson.color.border=#e0e0e0
watson.color.badge=#e81818

---


<ruta> .\src\main\resources\static\css\watson-chatbot.css
---
:root {
    --watson-primary: #0f62fe;
    --watson-primary-hover: #0353e9;
    --watson-bg-light: #ffffff;
    --watson-bg-dark: #f4f4f4;
    --watson-text-primary: #161616;
    --watson-text-secondary: #525252;
    --watson-border: #e0e0e0;
    --watson-badge: #e81818;
    --watson-shadow: 0 4px 12px rgba(0, 0, 0, 0.12);
    --watson-shadow-lg: 0 8px 24px rgba(0, 0, 0, 0.15);
    --watson-radius: 8px;
    --watson-transition: all 0.3s cubic-bezier(0.2, 0, 0.38, 0.9);
}

#watson-container {
    position: fixed;
    bottom: 20px;
    right: 20px;
    z-index: 9999;
    font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, 'Helvetica Neue', Arial, sans-serif;
}

#watson-toggle {
    position: relative;
    width: 56px;
    height: 56px;
    border: none;
    border-radius: 50%;
    background: linear-gradient(135deg, var(--watson-primary) 0%, var(--watson-primary-hover) 100%);
    color: white;
    cursor: pointer;
    display: flex;
    align-items: center;
    justify-content: center;
    box-shadow: var(--watson-shadow-lg);
    transition: var(--watson-transition);
    padding: 0;
}

#watson-toggle:hover {
    transform: scale(1.1);
    box-shadow: 0 10px 32px rgba(15, 98, 254, 0.3);
}

#watson-toggle:active {
    transform: scale(0.95);
}

#watson-badge {
    position: absolute;
    top: -8px;
    right: -8px;
    background: var(--watson-badge);
    color: white;
    width: 24px;
    height: 24px;
    border-radius: 50%;
    font-size: 12px;
    font-weight: bold;
    display: none;
    align-items: center;
    justify-content: center;
    border: 2px solid white;
    animation: pulse 1.5s ease-in-out infinite;
}

@keyframes pulse {
    0%, 100% {
        transform: scale(1);
    }
    50% {
        transform: scale(1.15);
    }
}

#watson-panel {
    position: absolute;
    bottom: 80px;
    right: 0;
    width: 420px;
    height: 600px;
    background: var(--watson-bg-light);
    border-radius: var(--watson-radius);
    box-shadow: var(--watson-shadow-lg);
    border: 1px solid var(--watson-border);
    display: none;
    flex-direction: column;
    overflow: hidden;
    animation: slideIn 0.3s ease-out;
}

@keyframes slideIn {
    from {
        opacity: 0;
        transform: translateY(10px) scale(0.95);
    }
    to {
        opacity: 1;
        transform: translateY(0) scale(1);
    }
}

#watson-panel.active {
    display: flex;
}

.watson-loading {
    display: flex;
    align-items: center;
    justify-content: center;
    height: 100%;
    flex-direction: column;
    gap: 16px;
    color: var(--watson-text-secondary);
}

.watson-spinner {
    width: 40px;
    height: 40px;
    border: 4px solid var(--watson-bg-dark);
    border-top-color: var(--watson-primary);
    border-radius: 50%;
    animation: spin 0.8s linear infinite;
}

@keyframes spin {
    to { transform: rotate(360deg); }
}

.watson-loading-text {
    font-size: 14px;
    text-align: center;
}

@media (max-width: 600px) {
    #watson-container {
        bottom: 16px;
        right: 16px;
    }

    #watson-toggle {
        width: 48px;
        height: 48px;
    }

    #watson-panel {
        width: 100%;
        height: 100%;
        max-width: 100vw;
        max-height: 100vh;
        bottom: 0;
        right: 0;
        border-radius: 0;
        animation: slideInMobile 0.3s ease-out;
    }

    @keyframes slideInMobile {
        from {
            opacity: 0;
            transform: translateY(100%);
        }
        to {
            opacity: 1;
            transform: translateY(0);
        }
    }
}

#watson-toggle:focus-visible {
    outline: 2px solid var(--watson-primary);
    outline-offset: 2px;
}

@media (prefers-reduced-motion: reduce) {
    #watson-toggle,
    #watson-panel,
    #watson-badge {
        transition: none !important;
        animation: none !important;
    }

    #watson-toggle:hover {
        transform: none;
    }

    #watson-toggle:active {
        transform: none;
    }
}


---


<ruta> .\src\main\resources\static\js\watson-chatbot.js
---
class WatsonChatbot {
    constructor() {
        this.watsonUrl = null;
        this.isOpen = false;
        this.isLoaded = false;
        this.elements = {};
        this.init();
    }

    async init() {
        try {
            await this.loadWatsonUrl();

            this.cacheElements();

            this.attachEventListeners();

            console.log('[Watson] Chatbot inicializado correctamente');
        } catch (error) {
            console.error('[Watson] Error al inicializar:', error.message);
        }
    }

    async loadWatsonUrl() {
        try {
            const response = await fetch('/api/watson/config', {
                method: 'GET',
                headers: {
                    'Content-Type': 'application/json',
                    'X-Requested-With': 'XMLHttpRequest'
                }
            });

            if (response.ok) {
                const config = await response.json();
                this.watsonUrl = config.watsonUrl;
                this.applyCssVariables(config);
                console.log('[Watson] ConfiguraciÃ³n cargada desde backend');
            } else {
                throw new Error('No se pudo obtener la configuraciÃ³n del servidor');
            }
        } catch (error) {
            this.watsonUrl = this.getWatsonUrlFromMeta() || this.getWatsonUrlFromWindow();

            if (!this.watsonUrl) {
                throw new Error('No se encontrÃ³ la URL de Watson.');
            }
            console.log('[Watson] URL cargada desde configuraciÃ³n alternativa');
        }
    }

    applyCssVariables(config) {
        const root = document.documentElement;
        if (config.primary) root.style.setProperty('--watson-primary', config.primary);
        if (config.primaryHover) root.style.setProperty('--watson-primary-hover', config.primaryHover);
        if (config.bgLight) root.style.setProperty('--watson-bg-light', config.bgLight);
        if (config.bgDark) root.style.setProperty('--watson-bg-dark', config.bgDark);
        if (config.textPrimary) root.style.setProperty('--watson-text-primary', config.textPrimary);
        if (config.textSecondary) root.style.setProperty('--watson-text-secondary', config.textSecondary);
        if (config.border) root.style.setProperty('--watson-border', config.border);
        if (config.badge) root.style.setProperty('--watson-badge', config.badge);
    }

    getWatsonUrlFromMeta() {
        const meta = document.querySelector('meta[name="watson-url"]');
        return meta ? meta.getAttribute('content') : null;
    }

    getWatsonUrlFromWindow() {
        return window.WATSON_URL || window.IBM_WATSON_URL || null;
    }

    cacheElements() {
        this.elements = {
            container: document.getElementById('watson-container'),
            toggleBtn: document.getElementById('watson-toggle'),
            panel: document.getElementById('watson-panel'),
            badge: document.getElementById('watson-badge'),
            iconChat: document.getElementById('watson-icon-chat'),
            iconClose: document.getElementById('watson-icon-close')
        };

        if (!Object.values(this.elements).every(el => el)) {
            throw new Error('No se encontraron elementos del DOM requeridos');
        }
    }

    attachEventListeners() {
        this.elements.toggleBtn.addEventListener('click', () => this.toggle());

        document.addEventListener('keydown', (e) => {
            if (e.key === 'Escape' && this.isOpen) {
                this.close();
            }
        });

        document.addEventListener('click', (e) => {
            if (this.isOpen &&
                !this.elements.container.contains(e.target) &&
                !e.target.closest('[data-watson-ignore]')) {
            }
        });
    }

    toggle() {
        if (this.isOpen) {
            this.close();
        } else {
            this.open();
        }
    }

    open() {
        if (!this.watsonUrl) {
            console.error('[Watson] URL no configurada');
            return;
        }

        this.isOpen = true;

        this.elements.panel.classList.add('active');
        this.elements.toggleBtn.classList.add('active');

        if (!this.isLoaded) {
            this.loadWatson();
        }

        this.elements.panel.style.opacity = '0';
        setTimeout(() => {
            this.elements.panel.style.transition = 'opacity 0.3s ease-in';
            this.elements.panel.style.opacity = '1';
        }, 10);

        console.log('[Watson] Panel abierto');
    }

    close() {
        this.isOpen = false;

        this.elements.panel.style.opacity = '0';
        setTimeout(() => {
            this.elements.panel.classList.remove('active');
            this.elements.toggleBtn.classList.remove('active');
        }, 300);

        console.log('[Watson] Panel cerrado');
    }

    loadWatson() {
        if (this.isLoaded) return;

        this.showLoading();

        const script = document.createElement('script');
        script.src = this.watsonUrl;
        script.async = true;

        script.onload = () => {
            this.isLoaded = true;
            this.hideLoading();
            console.log('[Watson] Script cargado exitosamente');
        };

        script.onerror = () => {
            console.error('[Watson] Error al cargar el script');
            this.showError('Error al cargar el asistente. Por favor, intenta mÃ¡s tarde.');
        };

        document.body.appendChild(script);
    }

    showLoading() {
        const loading = document.createElement('div');
        loading.className = 'watson-loading';
        loading.id = 'watson-loading';
        loading.innerHTML = `
            <div class="watson-spinner"></div>
            <div class="watson-loading-text">Cargando asistente virtual...</div>
        `;
        this.elements.panel.innerHTML = '';
        this.elements.panel.appendChild(loading);
    }

    hideLoading() {
        const loading = document.getElementById('watson-loading');
        if (loading) {
            loading.remove();
        }
    }

    showError(message) {
        const error = document.createElement('div');
        error.className = 'watson-loading';
        error.innerHTML = `
            <svg style="width: 48px; height: 48px; color: #e81818;" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2">
                <circle cx="12" cy="12" r="10"></circle>
                <line x1="12" y1="8" x2="12" y2="12"></line>
                <line x1="12" y1="16" x2="12.01" y2="16"></line>
            </svg>
            <div class="watson-loading-text">${message}</div>
        `;
        this.elements.panel.innerHTML = '';
        this.elements.panel.appendChild(error);
    }

    showNotification(count = 1) {
        const badge = this.elements.badge;
        badge.textContent = count;
        badge.style.display = 'flex';
    }

    hideNotification() {
        this.elements.badge.style.display = 'none';
    }

    destroy() {
        this.elements.toggleBtn.removeEventListener('click', () => this.toggle());
        document.removeEventListener('keydown', (e) => {
            if (e.key === 'Escape') this.close();
        });
        this.isOpen = false;
        this.isLoaded = false;
    }
}

if (document.readyState === 'loading') {
    document.addEventListener('DOMContentLoaded', () => {
        window.watsonChatbot = new WatsonChatbot();
    });
} else {
    window.watsonChatbot = new WatsonChatbot();
}

if (typeof module !== 'undefined' && module.exports) {
    module.exports = WatsonChatbot;
}


---


<ruta> .\src\main\resources\templates\admin-alternativas.html
---
<!DOCTYPE html>
<html lang="es" xmlns:th="http://www.thymeleaf.org">

<head>
	<meta charset="UTF-8">
	<title>Alternativas</title>
	<style>
		* {
			box-sizing: border-box;
			font-family: Arial, sans-serif;
		}

		body {
			margin: 0;
			background: linear-gradient(135deg, #0f172a, #1e3a8a);
			min-height: 100vh;
			padding: 30px;
		}

		.container {
			max-width: 1100px;
			margin: 0 auto;
		}

		.box {
			background: white;
			border-radius: 16px;
			padding: 24px;
			box-shadow: 0 10px 30px rgba(0, 0, 0, 0.2);
			margin-bottom: 20px;
		}

		input,
		select {
			width: 100%;
			padding: 12px;
			margin-top: 6px;
			margin-bottom: 14px;
			border: 1px solid #ccc;
			border-radius: 10px;
		}

		.btn {
			display: inline-block;
			padding: 10px 16px;
			background: #2563eb;
			color: white;
			text-decoration: none;
			border: none;
			border-radius: 10px;
			font-weight: bold;
			cursor: pointer;
		}

		.btn:hover {
			background: #1d4ed8;
		}

		.btn-sec {
			display: inline-block;
			padding: 10px 16px;
			background: #6b7280;
			color: white;
			text-decoration: none;
			border: none;
			border-radius: 10px;
			font-weight: bold;
			cursor: pointer;
		}

		.btn-sec:hover {
			background: #4b5563;
		}

		table {
			width: 100%;
			border-collapse: collapse;
			margin-top: 14px;
		}

		th,
		td {
			padding: 12px;
			border-bottom: 1px solid #ddd;
			text-align: left;
		}

		th {
			background: #f3f4f6;
		}

		.link {
			color: #2563eb;
			text-decoration: none;
			font-weight: bold;
		}
	</style>
</head>

<body>
	<div class="container">
		<div class="box">
			<h1>Alternativas de la pregunta</h1>
			<p><strong th:text="${pregunta.texto}">Pregunta</strong></p>
			<a class="btn-sec"
				th:href="@{'/admin/simulacion/' + ${pregunta.simulacion.idSimulacion} + '/preguntas'}">Volver</a>
		</div>

		<div class="box">
			<h2>Nueva alternativa</h2>

			<form th:action="@{'/admin/pregunta/' + ${pregunta.idPregunta} + '/alternativas/guardar'}" method="post">
				<label>Texto de la alternativa</label>
				<input type="text" name="texto" required>

				<label>Puntaje</label>
				<input type="number" name="puntaje" required>

				<label>Siguiente pregunta</label>
				<select name="idSiguientePregunta">
					<option value="">-- Sin siguiente pregunta (termina flujo) --</option>
					<option th:each="p : ${preguntasSimulacion}" th:value="${p.idPregunta}" th:text="${p.texto}">
					</option>
				</select>

				<button class="btn" type="submit">Guardar alternativa</button>
			</form>
		</div>

		<div class="box">
			<h2>Alternativas registradas</h2>
			<table>
				<thead>
					<tr>
						<th>ID</th>
						<th>Texto</th>
						<th>Puntaje</th>
						<th>Siguiente pregunta</th>
						<th>Acciones</th>
					</tr>
				</thead>
				<tbody>
					<tr th:each="alt : ${alternativas}">
						<td th:text="${alt.idAlternativa}">1</td>
						<td th:text="${alt.texto}">Texto</td>
						<td th:text="${alt.puntaje}">0</td>
						<td th:if="${alt.siguientePregunta != null}" th:text="${alt.siguientePregunta.texto}">Siguiente
						</td>
						<td th:if="${alt.siguientePregunta == null}">Fin de simulaciÃ³n</td>
						<td>
							<a class="link"
								th:href="@{'/admin/alternativa/' + ${alt.idAlternativa} + '/editar'}">Editar</a>
							|
							<a class="link" th:href="@{'/admin/alternativa/' + ${alt.idAlternativa} + '/desactivar'}"
								onclick="return confirm('Â¿Deseas desactivar esta alternativa?');">
								Desactivar
							</a>
						</td>
					</tr>
				</tbody>
			</table>
		</div>
	</div>

	<div th:replace="~{fragments/watson-widget :: widget}"></div>

</body>

</html>

---


<ruta> .\src\main\resources\templates\admin-pregunta-form.html
---
<!DOCTYPE html>
<html lang="es" xmlns:th="http://www.thymeleaf.org">

<head>
	<meta charset="UTF-8">
	<title th:text="${modo == 'editar'} ? 'Editar pregunta' : 'Nueva pregunta'">Pregunta</title>
	<style>
		* {
			box-sizing: border-box;
			font-family: Arial, sans-serif;
		}

		body {
			margin: 0;
			background: linear-gradient(135deg, #0f172a, #1e3a8a);
			min-height: 100vh;
			display: flex;
			justify-content: center;
			align-items: center;
			padding: 24px;
		}

		.card {
			width: 100%;
			max-width: 600px;
			background: white;
			border-radius: 16px;
			padding: 28px;
			box-shadow: 0 10px 30px rgba(0, 0, 0, 0.2);
		}

		input[type="text"],
		input[type="number"] {
			width: 100%;
			padding: 12px;
			margin-top: 6px;
			margin-bottom: 16px;
			border: 1px solid #ccc;
			border-radius: 10px;
		}

		.btn,
		.btn-volver {
			width: 100%;
			padding: 12px;
			border: none;
			border-radius: 10px;
			font-weight: bold;
			cursor: pointer;
			text-align: center;
			display: block;
			text-decoration: none;
		}

		.btn {
			background: #2563eb;
			color: white;
		}

		.btn:hover {
			background: #1d4ed8;
		}

		.btn-volver {
			margin-top: 10px;
			background: #6b7280;
			color: white;
		}

		.btn-volver:hover {
			background: #4b5563;
		}
	</style>
</head>

<body>
	<div class="card">
		<h1 th:text="${modo == 'editar'} ? 'Editar pregunta' : 'Nueva pregunta'">Pregunta</h1>
		<p th:text="'SimulaciÃ³n: ' + ${simulacion.titulo}">SimulaciÃ³n</p>

		<form th:action="${modo == 'editar'} 
            ? @{'/admin/pregunta/' + ${pregunta.idPregunta} + '/actualizar'} 
            : @{'/admin/simulacion/' + ${simulacion.idSimulacion} + '/preguntas/guardar'}" method="post">

			<label>Texto de la pregunta</label>
			<input type="text" name="texto" th:value="${pregunta.texto}" required>

			<label>Orden</label>
			<input type="number" name="orden" th:value="${pregunta.orden != null ? pregunta.orden : 0}">

			<label>
				<input type="checkbox" name="esInicial" value="true" th:checked="${pregunta.esInicial}">
				Â¿Es pregunta inicial?
			</label>
			<br><br>

			<label>
				<input type="checkbox" name="esFinal" value="true" th:checked="${pregunta.esFinal}">
				Â¿Es pregunta final?
			</label>
			<br><br>

			<button class="btn" type="submit"
				th:text="${modo == 'editar'} ? 'Actualizar pregunta' : 'Guardar pregunta'">
				Guardar
			</button>
		</form>

		<a th:href="@{'/admin/simulacion/' + ${simulacion.idSimulacion} + '/preguntas'}" class="btn-volver">
			Volver
		</a>
	</div>

	<div th:replace="~{fragments/watson-widget :: widget}"></div>

</body>

</html>

---


<ruta> .\src\main\resources\templates\admin-preguntas.html
---
<!DOCTYPE html>
<html lang="es" xmlns:th="http://www.thymeleaf.org">

<head>
	<meta charset="UTF-8">
	<title>Preguntas</title>
	<style>
		* {
			box-sizing: border-box;
			font-family: Arial, sans-serif;
		}

		body {
			margin: 0;
			background: linear-gradient(135deg, #0f172a, #1e3a8a);
			min-height: 100vh;
			padding: 30px;
		}

		.container {
			max-width: 1100px;
			margin: 0 auto;
		}

		.box {
			background: white;
			border-radius: 16px;
			padding: 24px;
			box-shadow: 0 10px 30px rgba(0, 0, 0, 0.2);
			margin-bottom: 20px;
		}

		.btn {
			display: inline-block;
			padding: 10px 16px;
			background: #2563eb;
			color: white;
			text-decoration: none;
			border-radius: 10px;
			font-weight: bold;
		}

		.btn:hover {
			background: #1d4ed8;
		}

		table {
			width: 100%;
			border-collapse: collapse;
			margin-top: 14px;
		}

		th,
		td {
			padding: 12px;
			border-bottom: 1px solid #ddd;
			text-align: left;
		}

		th {
			background: #f3f4f6;
		}

		.link {
			color: #2563eb;
			text-decoration: none;
			font-weight: bold;
		}
	</style>
</head>

<body>
	<div class="container">
		<div class="box">
			<h1 th:text="'Preguntas de: ' + ${simulacion.titulo}">Preguntas</h1>
			<p th:text="${simulacion.descripcion}">DescripciÃ³n</p>
			<a class="btn" th:href="@{'/admin/simulacion/' + ${simulacion.idSimulacion} + '/preguntas/nueva'}">
				Nueva pregunta
			</a>
			<a class="btn" href="/admin/dashboard" style="margin-left:10px;">Volver</a>
		</div>

		<div class="box">
			<table>
				<thead>
					<tr>
						<th>ID</th>
						<th>Texto</th>
						<th>Orden</th>
						<th>Inicial</th>
						<th>Final</th>
						<th>Alternativas</th>
					</tr>
				</thead>
				<tbody>
					<tr th:each="preg : ${preguntas}">
						<td th:text="${preg.idPregunta}">1</td>
						<td th:text="${preg.texto}">Texto</td>
						<td th:text="${preg.orden}">1</td>
						<td th:text="${preg.esInicial} ? 'SÃ­' : 'No'">SÃ­</td>
						<td th:text="${preg.esFinal} ? 'SÃ­' : 'No'">No</td>
						<td>
							<a class="link" th:href="@{'/admin/pregunta/' + ${preg.idPregunta} + '/alternativas'}">
								Alternativas
							</a>
							|
							<a class="link" th:href="@{'/admin/pregunta/' + ${preg.idPregunta} + '/editar'}">
								Editar
							</a>
							|
							<a class="link" th:href="@{'/admin/pregunta/' + ${preg.idPregunta} + '/desactivar'}"
								onclick="return confirm('Â¿Deseas desactivar esta pregunta?');">
								Desactivar
							</a>
						</td>
					</tr>
				</tbody>
			</table>
		</div>
	</div>

	<link rel="stylesheet" href="/css/watson-chatbot.css">

	<div th:replace="~{fragments/watson-widget :: widget}"></div>
	
</body>

</html>

---


<ruta> .\src\main\resources\templates\dashboard.html
---
<!DOCTYPE html>
<html lang="es" xmlns:th="http://www.thymeleaf.org">

<head>
	<meta charset="UTF-8">
	<title>Dashboard Admin</title>
	<style>
		* {
			box-sizing: border-box;
			font-family: Arial, sans-serif;
		}

		body {
			margin: 0;
			background: linear-gradient(135deg, #0f172a, #1e3a8a);
			min-height: 100vh;
			padding: 30px;
		}

		.container {
			max-width: 1000px;
			margin: 0 auto;
		}

		.header,
		.card {
			background: white;
			border-radius: 16px;
			box-shadow: 0 10px 30px rgba(0, 0, 0, 0.2);
		}

		.header {
			padding: 24px;
			margin-bottom: 24px;
			text-align: center;
		}

		.header h1 {
			margin: 0 0 8px;
		}

		.grid {
			display: grid;
			gap: 20px;
		}

		.card {
			padding: 22px;
		}

		.btn {
			display: inline-block;
			margin-top: 12px;
			padding: 10px 16px;
			background: #2563eb;
			color: white;
			text-decoration: none;
			border-radius: 10px;
			font-weight: bold;
		}

		.btn:hover {
			background: #1d4ed8;
		}

		.top-link {
			display: inline-block;
			margin-top: 16px;
			color: white;
			text-decoration: none;
			font-weight: bold;
		}
	</style>
</head>

<body>
	<div class="container">
		<div class="header">
			<h1>Panel Administrador</h1>
			<p>GestiÃ³n de simulaciones, preguntas y alternativas</p>
		</div>

		<div class="grid">
			<div class="card" th:each="sim : ${simulaciones}">
				<h2 th:text="${sim.titulo}">TÃ­tulo</h2>
				<p th:text="${sim.descripcion}">DescripciÃ³n</p>
				<a class="btn" th:href="@{'/admin/simulacion/' + ${sim.idSimulacion} + '/preguntas'}">
					Gestionar preguntas
				</a>
			</div>
		</div>

		<a class="top-link" href="/logout">Cerrar sesiÃ³n</a>
	</div>

	<div th:replace="~{fragments/watson-widget :: widget}"></div>

</body>

</html>

---


<ruta> .\src\main\resources\templates\gracias.html
---
<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">

<head>
	<meta charset="UTF-8">
	<title>Â¡Gracias!</title>
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
	<style>
		body {
			background-color: #121212;
			color: #e0e0e0;
			height: 100vh;
			display: flex;
			align-items: center;
		}

		.card {
			background-color: #1e1e1e;
			border: none;
			width: 100%;
			max-width: 400px;
			margin: auto;
		}
	</style>
</head>

<body>
	<div class="card shadow p-4 text-center">
		<div class="mb-3" style="font-size: 3rem;">
			<svg xmlns="http://www.w3.org/2000/svg" fill="white" width="48" height="48" viewBox="0 0 24 24">
				<path d="M20.285 2l-11.285 11.567-5.286-5.011-3.714 3.716 9 8.728 15-15.285z" />
			</svg>
		</div>
		<h3 class="text-white mb-2">Â¡Gracias por tu respuesta!</h3>
		<p class="text-secondary">Tu opiniÃ³n nos ayuda a mejorar.</p>
		<a th:href="@{/preguntas}" class="btn btn-outline-light mt-3">Responder otra vez</a>
	</div>
	
	<div th:replace="~{fragments/watson-widget :: widget}"></div>
</body>

</html>

---


<ruta> .\src\main\resources\templates\login.html
---
<!DOCTYPE html>
<html lang="es" xmlns:th="http://www.thymeleaf.org">

<head>
	<meta charset="UTF-8">
	<title>Login</title>
	<style>
		* {
			box-sizing: border-box;
			font-family: Arial, sans-serif;
		}

		body {
			margin: 0;
			background: linear-gradient(135deg, #0f172a, #1e3a8a);
			min-height: 100vh;
			display: flex;
			justify-content: center;
			align-items: center;
		}

		.card {
			width: 100%;
			max-width: 420px;
			background: #ffffff;
			padding: 32px;
			border-radius: 16px;
			box-shadow: 0 10px 30px rgba(0, 0, 0, 0.25);
		}

		.title {
			margin: 0 0 8px;
			font-size: 32px;
			color: #111827;
			text-align: center;
		}

		.subtitle {
			margin: 0 0 24px;
			text-align: center;
			color: #6b7280;
			font-size: 14px;
		}

		.alert {
			padding: 12px 14px;
			border-radius: 10px;
			margin-bottom: 16px;
			font-size: 14px;
		}

		.alert-error {
			background: #fee2e2;
			color: #991b1b;
		}

		.alert-success {
			background: #dcfce7;
			color: #166534;
		}

		.form-group {
			margin-bottom: 18px;
		}

		label {
			display: block;
			margin-bottom: 8px;
			color: #374151;
			font-weight: bold;
			font-size: 14px;
		}

		input {
			width: 100%;
			padding: 12px;
			border: 1px solid #d1d5db;
			border-radius: 10px;
			font-size: 14px;
			outline: none;
		}

		input:focus {
			border-color: #2563eb;
			box-shadow: 0 0 0 3px rgba(37, 99, 235, 0.15);
		}

		.btn {
			width: 100%;
			padding: 12px;
			background: #2563eb;
			color: white;
			border: none;
			border-radius: 10px;
			font-size: 15px;
			font-weight: bold;
			cursor: pointer;
			transition: 0.2s ease;
		}

		.btn:hover {
			background: #1d4ed8;
		}

		.footer-link {
			text-align: center;
			margin-top: 18px;
			font-size: 14px;
		}

		.footer-link a {
			color: #2563eb;
			text-decoration: none;
			font-weight: bold;
		}

		.footer-link a:hover {
			text-decoration: underline;
		}
	</style>
</head>

<body>
	<div class="card">
		<h1 class="title">Iniciar sesiÃ³n</h1>
		<p class="subtitle">Accede al simulador de decisiones</p>

		<div th:if="${param.error}" class="alert alert-error">
			Correo o contraseÃ±a incorrectos.
		</div>

		<div th:if="${param.registroExitoso}" class="alert alert-success">
			Registro exitoso. Ahora puedes iniciar sesiÃ³n.
		</div>

		<form th:action="@{/login}" method="post">
			<div class="form-group">
				<label for="correo">Correo institucional</label>
				<input type="email" id="correo" name="correo" placeholder="usuario@cibertec.edu.pe" required>
			</div>

			<div class="form-group">
				<label for="password">ContraseÃ±a</label>
				<input type="password" id="password" name="password" placeholder="Ingresa tu contraseÃ±a" required>
			</div>

			<button type="submit" class="btn">Ingresar</button>
		</form>

		<div class="footer-link">
			Â¿No tienes cuenta? <a href="/registro">Crear cuenta</a>
		</div>
	</div>

	<div th:replace="~{fragments/watson-widget :: widget}"></div>

</body>

</html>

---


<ruta> .\src\main\resources\templates\pregunta.html
---
<!DOCTYPE html>
<html lang="es" xmlns:th="http://www.thymeleaf.org">

<head>
	<meta charset="UTF-8">
	<title>Pregunta</title>
	<style>
		* {
			box-sizing: border-box;
			font-family: Arial, sans-serif;
		}

		body {
			margin: 0;
			background: linear-gradient(135deg, #0f172a, #1e3a8a);
			min-height: 100vh;
			display: flex;
			justify-content: center;
			align-items: center;
			padding: 24px;
		}

		.card {
			width: 100%;
			max-width: 760px;
			background: white;
			border-radius: 18px;
			padding: 32px;
			box-shadow: 0 12px 35px rgba(0, 0, 0, 0.24);
		}

		.badge {
			display: inline-block;
			background: #eff6ff;
			color: #1d4ed8;
			padding: 10px 14px;
			border-radius: 999px;
			font-size: 14px;
			font-weight: bold;
			margin-bottom: 20px;
		}

		.question {
			font-size: 30px;
			color: #111827;
			margin: 0 0 24px;
			line-height: 1.3;
		}

		.options {
			display: flex;
			flex-direction: column;
			gap: 14px;
			margin-bottom: 24px;
		}

		.option {
			border: 1px solid #d1d5db;
			border-radius: 12px;
			padding: 16px;
			transition: 0.2s ease;
			cursor: pointer;
		}

		.option:hover {
			border-color: #2563eb;
			background: #f8fbff;
		}

		.option input {
			margin-right: 10px;
		}

		.option span {
			font-size: 16px;
			color: #1f2937;
		}

		.btn {
			width: 100%;
			padding: 14px;
			border: none;
			border-radius: 12px;
			background: #2563eb;
			color: white;
			font-size: 16px;
			font-weight: bold;
			cursor: pointer;
			transition: 0.2s ease;
		}

		.btn:hover {
			background: #1d4ed8;
		}
	</style>
</head>

<body>
	<div class="card">
		<div class="badge">
			Puntaje acumulado: <span th:text="${puntajeTotal}">0</span>
		</div>

		<h2 class="question" th:text="${pregunta.texto}">
			Texto de la pregunta
		</h2>

		<form th:action="@{/simulacion/responder}" method="post">
			<div class="options">
				<label class="option" th:each="alt : ${alternativas}">
					<input type="radio" name="idAlternativa" th:value="${alt.idAlternativa}" required>
					<span th:text="${alt.texto}">Texto de alternativa</span>
				</label>
			</div>

			<button type="submit" class="btn">Responder</button>
		</form>
	</div>

	<div th:replace="~{fragments/watson-widget :: widget}"></div>

</body>

</html>

---


<ruta> .\src\main\resources\templates\preguntas-publico.html
---
<!DOCTYPE html>
<html lang="es" xmlns:th="http://www.thymeleaf.org">

<head>
	<meta charset="UTF-8">
	<title>Simulaciones disponibles</title>
	<style>
		* {
			box-sizing: border-box;
			font-family: Arial, sans-serif;
		}

		body {
			margin: 0;
			background: linear-gradient(135deg, #0f172a, #1e3a8a);
			min-height: 100vh;
			padding: 40px 20px;
		}

		.container {
			max-width: 900px;
			margin: 0 auto;
		}

		.header {
			background: white;
			border-radius: 16px;
			padding: 28px;
			margin-bottom: 24px;
			box-shadow: 0 10px 30px rgba(0, 0, 0, 0.2);
			text-align: center;
		}

		.header h1 {
			margin: 0 0 8px;
			color: #111827;
			font-size: 34px;
		}

		.header p {
			margin: 0;
			color: #6b7280;
		}

		.alert {
			padding: 14px;
			border-radius: 10px;
			margin-bottom: 18px;
			font-size: 14px;
		}

		.alert-error {
			background: #fee2e2;
			color: #991b1b;
		}

		.grid {
			display: grid;
			grid-template-columns: repeat(auto-fit, minmax(300px, 1fr));
			gap: 20px;
		}

		.card {
			background: white;
			border-radius: 16px;
			padding: 24px;
			box-shadow: 0 10px 30px rgba(0, 0, 0, 0.18);
		}

		.card h3 {
			margin-top: 0;
			margin-bottom: 10px;
			color: #111827;
			font-size: 22px;
		}

		.card p {
			color: #4b5563;
			line-height: 1.5;
			min-height: 60px;
		}

		.btn {
			display: inline-block;
			margin-top: 12px;
			padding: 12px 18px;
			background: #2563eb;
			color: white;
			text-decoration: none;
			border-radius: 10px;
			font-weight: bold;
			transition: 0.2s ease;
		}

		.btn:hover {
			background: #1d4ed8;
		}

		.actions {
			margin-top: 24px;
			text-align: center;
		}

		.link-back {
			color: white;
			text-decoration: none;
			font-weight: bold;
		}

		.link-back:hover {
			text-decoration: underline;
		}
	</style>
</head>

<body>
	<div class="container">
		<div class="header">
			<h1>Simulaciones disponibles</h1>
			<p>Selecciona una simulaciÃ³n para iniciar el recorrido de decisiones</p>
		</div>

		<div th:if="${param.sinPreguntas}" class="alert alert-error">
			La simulaciÃ³n seleccionada no tiene una pregunta inicial configurada.
		</div>

		<div class="grid">
			<div class="card" th:each="sim : ${simulaciones}">
				<h3 th:text="${sim.titulo}">TÃ­tulo de simulaciÃ³n</h3>
				<p th:text="${sim.descripcion}">DescripciÃ³n de la simulaciÃ³n</p>
				<a class="btn" th:href="@{'/simulacion/' + ${sim.idSimulacion} + '/iniciar'}">
					Iniciar simulaciÃ³n
				</a>
			</div>
		</div>

		<div class="actions">
			<a class="link-back" href="/login">Volver al login</a>
		</div>
	</div>

	<div th:replace="~{fragments/watson-widget :: widget}"></div>
</body>

</html>

---


<ruta> .\src\main\resources\templates\registro.html
---
<!DOCTYPE html>
<html lang="es" xmlns:th="http://www.thymeleaf.org">

<head>
	<meta charset="UTF-8">
	<title>Registro</title>
	<style>
		* {
			box-sizing: border-box;
			font-family: Arial, sans-serif;
		}

		body {
			margin: 0;
			background: linear-gradient(135deg, #0f172a, #1e3a8a);
			min-height: 100vh;
			display: flex;
			justify-content: center;
			align-items: center;
			padding: 20px;
		}

		.card {
			width: 100%;
			max-width: 480px;
			background: #ffffff;
			padding: 32px;
			border-radius: 16px;
			box-shadow: 0 10px 30px rgba(0, 0, 0, 0.25);
		}

		.title {
			margin: 0 0 8px;
			font-size: 30px;
			color: #111827;
			text-align: center;
		}

		.subtitle {
			margin: 0 0 24px;
			text-align: center;
			color: #6b7280;
			font-size: 14px;
		}

		.alert {
			padding: 12px 14px;
			border-radius: 10px;
			margin-bottom: 16px;
			font-size: 14px;
		}

		.alert-error {
			background: #fee2e2;
			color: #991b1b;
		}

		.form-group {
			margin-bottom: 18px;
		}

		label {
			display: block;
			margin-bottom: 8px;
			color: #374151;
			font-weight: bold;
			font-size: 14px;
		}

		input {
			width: 100%;
			padding: 12px;
			border: 1px solid #d1d5db;
			border-radius: 10px;
			font-size: 14px;
			outline: none;
		}

		input:focus {
			border-color: #2563eb;
			box-shadow: 0 0 0 3px rgba(37, 99, 235, 0.15);
		}

		.help {
			margin-top: 6px;
			color: #6b7280;
			font-size: 12px;
		}

		.btn {
			width: 100%;
			padding: 12px;
			background: #2563eb;
			color: white;
			border: none;
			border-radius: 10px;
			font-size: 15px;
			font-weight: bold;
			cursor: pointer;
			transition: 0.2s ease;
		}

		.btn:hover {
			background: #1d4ed8;
		}

		.footer-link {
			text-align: center;
			margin-top: 18px;
			font-size: 14px;
		}

		.footer-link a {
			color: #2563eb;
			text-decoration: none;
			font-weight: bold;
		}

		.footer-link a:hover {
			text-decoration: underline;
		}
	</style>
</head>

<body>
	<div class="card">
		<h1 class="title">Registro de usuario</h1>
		<p class="subtitle">Crea tu cuenta para acceder al simulador</p>

		<div th:if="${param.errorCorreo}" class="alert alert-error">
			Solo se permiten correos institucionales de Cibertec.
		</div>

		<div th:if="${param.correoExiste}" class="alert alert-error">
			Ese correo ya estÃ¡ registrado.
		</div>

		<div th:if="${param.errorRol}" class="alert alert-error">
			No se encontrÃ³ el rol USUARIO en la base de datos.
		</div>

		<form th:action="@{/registro}" method="post">
			<div class="form-group">
				<label for="nombre">Nombre</label>
				<input type="text" id="nombre" name="nombre" placeholder="Ingresa tu nombre" required>
			</div>

			<div class="form-group">
				<label for="apellido">Apellido</label>
				<input type="text" id="apellido" name="apellido" placeholder="Ingresa tu apellido" required>
			</div>

			<div class="form-group">
				<label for="correo">Correo institucional</label>
				<input type="email" id="correo" name="correo" placeholder="usuario@cibertec.edu.pe" required>
				<div class="help">Solo se aceptan correos con dominio @cibertec.edu.pe</div>
			</div>

			<div class="form-group">
				<label for="password">ContraseÃ±a</label>
				<input type="password" id="password" name="password" placeholder="Crea una contraseÃ±a" required>
			</div>

			<button type="submit" class="btn">Registrarse</button>
		</form>

		<div class="footer-link">
			Â¿Ya tienes cuenta? <a href="/login">Iniciar sesiÃ³n</a>
		</div>
	</div>

	<div th:replace="~{fragments/watson-widget :: widget}"></div>
</body>

</html>

---


<ruta> .\src\main\resources\templates\resultado.html
---
<!DOCTYPE html>
<html lang="es" xmlns:th="http://www.thymeleaf.org">

<head>
	<meta charset="UTF-8">
	<title>Resultado</title>
	<style>
		* {
			box-sizing: border-box;
			font-family: Arial, sans-serif;
		}

		body {
			margin: 0;
			background: linear-gradient(135deg, #0f172a, #1e3a8a);
			min-height: 100vh;
			display: flex;
			justify-content: center;
			align-items: center;
			padding: 24px;
		}

		.card {
			width: 100%;
			max-width: 700px;
			background: white;
			border-radius: 18px;
			padding: 36px;
			box-shadow: 0 12px 35px rgba(0, 0, 0, 0.24);
			text-align: center;
		}

		.title {
			margin: 0 0 16px;
			color: #111827;
			font-size: 34px;
		}

		.score-box {
			background: #eff6ff;
			color: #1d4ed8;
			padding: 18px;
			border-radius: 14px;
			margin: 20px 0;
		}

		.score-box p {
			margin: 0;
			font-size: 18px;
		}

		.score-box strong {
			font-size: 34px;
			display: block;
			margin-top: 6px;
		}

		.message {
			margin: 22px 0 28px;
			font-size: 18px;
			color: #374151;
			line-height: 1.6;
		}

		.btn {
			display: inline-block;
			padding: 14px 20px;
			background: #2563eb;
			color: white;
			text-decoration: none;
			border-radius: 12px;
			font-weight: bold;
			transition: 0.2s ease;
		}

		.btn:hover {
			background: #1d4ed8;
		}
	</style>
</head>

<body>
	<div class="card">
		<h1 class="title">Resultado final de la simulaciÃ³n</h1>

		<div class="score-box">
			<p>Puntaje total obtenido</p>
			<strong th:text="${puntajeTotal}">0</strong>
		</div>

		<p class="message" th:text="${mensaje}">
			Mensaje final
		</p>

		<a class="btn" href="/simulacion">Volver a simulaciones</a>
	</div>

	<div th:replace="~{fragments/watson-widget :: widget}"></div>

</body>

</html>

---


<ruta> .\src\main\resources\templates\fragments\watson-widget.html
---
<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">

<body>

	<th:block th:fragment="widget">
		<link rel="stylesheet" href="/css/watson-chatbot.css">

		<div id="watson-container">
			<button id="watson-toggle">
				<svg width="24" height="24" viewBox="0 0 24 24" fill="currentColor">
					<path
						d="M12 2C6.48 2 2 6.48 2 12s4.48 10 10 10 10-4.48 10-10S17.52 2 12 2zm0 18c-4.41 0-8-3.59-8-8s3.59-8 8-8 8 3.59 8 8-3.59 8-8 8zm3.5-9c.83 0 1.5-.67 1.5-1.5S16.33 8 15.5 8 14 8.67 14 9.5s.67 1.5 1.5 1.5zm-7 0c.83 0 1.5-.67 1.5-1.5S9.33 8 8.5 8 7 8.67 7 9.5 7.67 11 8.5 11zm3.5 6.5c2.33 0 4.31-1.46 5.11-3.5H6.89c.8 2.04 2.78 3.5 5.11 3.5z" />
				</svg>
				<div id="watson-badge">1</div>
			</button>
			<div id="watson-panel"></div>
		</div>

		<script src="/js/watson-chatbot.js"></script>
	</th:block>

</body>

</html>

---


<ruta> .\src\test\java\com\proyecto\PI09\Grupo09ApplicationTests.java
---
package com.proyecto.PI09;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Grupo09ApplicationTests {

	@Test
	void contextLoads() {
	}

}


---


<ruta> .\target\classes\application.properties
---
spring.application.name=grupo09

spring.datasource.url=jdbc:postgresql://localhost:5432/db_yachay
spring.datasource.username=postgres
spring.datasource.password=postgres
spring.datasource.driver-class-name=org.postgresql.Driver

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect


---


<ruta> .\target\classes\application.properties.example
---
spring.application.name=grupo09

#spring.datasource.url=jdbc:mysql://localhost:3306/db_yachay
#spring.datasource.username=root
#spring.datasource.password=root
#spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
#
#spring.jpa.hibernate.ddl-auto=none
#spring.jpa.show-sql=true
#spring.jpa.properties.hibernate.format_sql=true
#spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLDialect

# Configuración de conexión para PostgreSQL
spring.datasource.url=jdbc:postgresql://localhost:5432/db_yachay
spring.datasource.username=postgres
spring.datasource.password=postgres
spring.datasource.driver-class-name=org.postgresql.Driver

# Configuración de JPA / Hibernate
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true

watson.url=https://api.us-east.assistant.watson.cloud.ibm.com/instances/2749de81-1f26-4ac7-91f8-6d15d9613faf

watson.color.primary=#0f62fe
watson.color.primary-hover=#0353e9
watson.color.bg-light=#ffffff
watson.color.bg-dark=#f4f4f4
watson.color.text-primary=#161616
watson.color.text-secondary=#525252
watson.color.border=#e0e0e0
watson.color.badge=#e81818

---


<ruta> .\target\classes\com\proyecto\PI09\Grupo09Application.class
---
Êþº¾   =   $com/proyecto/PI09/Grupo09Application  java/lang/Object <init> ()V Code
  	   LineNumberTable LocalVariableTable this &Lcom/proyecto/PI09/Grupo09Application; main ([Ljava/lang/String;)V
    *org/springframework/boot/SpringApplication   run b(Ljava/lang/Class;[Ljava/lang/String;)Lorg/springframework/context/ConfigurableApplicationContext; args [Ljava/lang/String; MethodParameters 
SourceFile Grupo09Application.java RuntimeVisibleAnnotations >Lorg/springframework/boot/autoconfigure/SpringBootApplication; !               /     *· ±    
                    	       6     *¸ W±    
   
    
                                   

---


<ruta> .\target\classes\com\proyecto\PI09\config\WatsonProperties$Color.class
---
Êþº¾   =    /com/proyecto/PI09/config/WatsonProperties$Color  java/lang/Object primary Ljava/lang/String; primaryHover bgLight bgDark textPrimary textSecondary border badge 
getPrimary ()Ljava/lang/String; RuntimeInvisibleAnnotations Llombok/Generated; Code	     LineNumberTable LocalVariableTable this 1Lcom/proyecto/PI09/config/WatsonProperties$Color; getPrimaryHover	     
getBgLight	     	getBgDark	  ! 	  getTextPrimary	  $ 
  getTextSecondary	  '   	getBorder	  *   getBadge	  -   
setPrimary (Ljava/lang/String;)V MethodParameters setPrimaryHover 
setBgLight 	setBgDark setTextPrimary setTextSecondary 	setBorder setBadge equals (Ljava/lang/Object;)Z
  ; < 9 canEqual
  >  
  @ 8 9
  B  
  D  
  F  
  H " 
  J % 
  L ( 
  N +  o Ljava/lang/Object; other this$primary other$primary this$primaryHover other$primaryHover this$bgLight other$bgLight this$bgDark other$bgDark this$textPrimary other$textPrimary this$textSecondary other$textSecondary this$border other$border 
this$badge other$badge StackMapTable hashCode ()I
  f c d PRIME I result $primary $primaryHover $bgLight $bgDark $textPrimary $textSecondary $border $badge toString   t u v makeConcatWithConstants ¤(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; <init> ()V
  z w x | #0f62fe ~ #0353e9 € #ffffff ‚ #f4f4f4 „ #161616 † #525252 ˆ #e0e0e0 Š #e81818 
SourceFile WatsonProperties.java BootstrapMethods
  ‘  $java/lang/invoke/StringConcatFactory u ’ ˜(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; Ž • yWatsonProperties.Color(primary=, primaryHover=, bgLight=, bgDark=, textPrimary=, textSecondary=, border=, badge=) InnerClasses ˜ )com/proyecto/PI09/config/WatsonProperties Color › %java/lang/invoke/MethodHandles$Lookup  java/lang/invoke/MethodHandles Lookup NestHost !                      	     
                                   /     *´ °                                       /     *´ °                                       /     *´ °                                       /     *´  °                         "              /     *´ #°                         %              /     *´ &°                         (              /     *´ )°                         +              /     *´ ,°                         . /             :     *+µ ±                              0       1 /             :     *+µ ±                              0       2 /             :     *+µ ±                              0       3 /             :     *+µ  ±                           	   0    	   4 /             :     *+µ #±                           
   0    
   5 /             :     *+µ &±                              0       6 /             :     *+µ )±                              0       7 /             :     *+µ ,±                              0       8 9            Œ    F+*¦ ¬+Á š ¬+À M,*¶ :š ¬*¶ =N,¶ =:-Ç Æ § -¶ ?š ¬*¶ A:,¶ A:Ç Æ § ¶ ?š ¬*¶ C:,¶ C:Ç Æ § ¶ ?š ¬*¶ E:	,¶ E:
	Ç 
Æ § 	
¶ ?š ¬*¶ G:,¶ G:Ç Æ § ¶ ?š ¬*¶ I:,¶ I:Ç Æ § ¶ ?š ¬*¶ K:,¶ K:Ç Æ § ¶ ?š ¬*¶ M:,¶ M:Ç Æ § ¶ ?š ¬¬               À   F      F O P  1 Q   $" R P  * S P  G ÿ T P  M ù U P  l Ú V P  r Ô W P  ‘ µ X P 	 — ¯ Y P 
 ¶  Z P  ¼ Š [ P  Û k \ P  á e ] P   F ^ P  @ _ P % ! ` P +  a P  b   b ü  ý   ý   	ý   	ý   	ý   	ý   	ý   	ý   	 0    O   < 9             9     +Á ¬                           Q P  0    Q   c d            "     Ü;<=*¶ =N;h-Ç +§ -¶ e`=*¶ A:;hÇ +§ ¶ e`=*¶ C:;hÇ +§ ¶ e`=*¶ E:;hÇ +§ ¶ e`=*¶ G:;hÇ +§ ¶ e`=*¶ I:;hÇ +§ ¶ e`=*¶ K:	;h	Ç +§ 	¶ e`=*¶ M:
;h
Ç +§ 
¶ e`=¬               p    Ü      Ù g h   × i h  
 Ò j P  # ¹ k P  > ž l P  Y ƒ m P  t h n P   M o P  ª 2 p P 	 Å  q P 
 b  ² ÿ     ÿ     ÿ      ÿ      ÿ       ÿ       ÿ        ÿ        ÿ         ÿ         ÿ  	        ÿ  	        ÿ  
         ÿ  
         ÿ            ÿ              r              P     &*¶ =*¶ A*¶ C*¶ E*¶ G*¶ I*¶ K*¶ Mº s  °                   &      w x             ƒ     5*· y*{µ *}µ *µ *µ  *ƒµ #*…µ &*‡µ )*‰µ ,±       * 
      
        "  (  .  4         5      ‹    Œ      “  ” –      — ™ 	 š œ ž  Ÿ    —

---


<ruta> .\target\classes\com\proyecto\PI09\config\WatsonProperties.class
---
Êþº¾   = c  )com/proyecto/PI09/config/WatsonProperties  java/lang/Object url Ljava/lang/String; color 1Lcom/proyecto/PI09/config/WatsonProperties$Color; getUrl ()Ljava/lang/String; RuntimeInvisibleAnnotations Llombok/Generated; Code	     LineNumberTable LocalVariableTable this +Lcom/proyecto/PI09/config/WatsonProperties; getColor 3()Lcom/proyecto/PI09/config/WatsonProperties$Color;	     setUrl (Ljava/lang/String;)V MethodParameters setColor 4(Lcom/proyecto/PI09/config/WatsonProperties$Color;)V equals (Ljava/lang/Object;)Z
    !  canEqual
  # 	 

  %  
  '   o Ljava/lang/Object; other this$url 	other$url 
this$color other$color StackMapTable hashCode ()I
  3 0 1 PRIME I result $url $color toString
 ; = < java/lang/String > ? valueOf &(Ljava/lang/Object;)Ljava/lang/String;   A B C makeConcatWithConstants 8(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; <init> ()V
  G D E I /com/proyecto/PI09/config/WatsonProperties$Color
 H G 
SourceFile WatsonProperties.java RuntimeVisibleAnnotations *Lorg/springframework/stereotype/Component; ELorg/springframework/boot/context/properties/ConfigurationProperties; prefix watson BootstrapMethods
 T V U $java/lang/invoke/StringConcatFactory B W ˜(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; S Z  WatsonProperties(url=, color=) InnerClasses Color ^ %java/lang/invoke/MethodHandles$Lookup ` java/lang/invoke/MethodHandles Lookup NestMembers !                	  	 
             /     *´ °                                       /     *´ °                                       :     *+µ ±                                                   :     *+µ ±                                                   ô     h+*¦ ¬+Á š ¬+À M,*¶ š ¬*¶ "N,¶ ":-Ç Æ § -¶ $š ¬*¶ &:,¶ &:Ç Æ § ¶ $š ¬¬               H    h       h ( )   S *   $ D + )  * > , )  G ! - )  M  . )  /     	ü  ý   ý   	     (   !              9     +Á ¬                           * )      *   0 1             Ü     :;<=*¶ "N;h-Ç +§ -¶ 2`=*¶ &:;hÇ +§ ¶ 2`=¬               4    :      7 4 5   5 6 5  
 0 7 )  #  8 )  /   J ÿ     ÿ     ÿ      ÿ        9 
             ;     *¶ "*¶ &¸ :º @  °                         D E             B     *· F*» HY· Jµ ±                             K    L M     N   O  Ps Q R     X  Y [     H  \ 	 ] _ a  b     H

---


<ruta> .\target\classes\com\proyecto\PI09\controller\AdminController.class
---
Êþº¾   =3  ,com/proyecto/PI09/controller/AdminController  java/lang/Object simulacionService -Lcom/proyecto/PI09/service/SimulacionService; RuntimeVisibleAnnotations 8Lorg/springframework/beans/factory/annotation/Autowired; preguntaService +Lcom/proyecto/PI09/service/PreguntaService; alternativaService .Lcom/proyecto/PI09/service/AlternativaService; <init> ()V Code
     LineNumberTable LocalVariableTable this .Lcom/proyecto/PI09/controller/AdminController; 	dashboard 2(Lorg/springframework/ui/Model;)Ljava/lang/String; 4Lorg/springframework/web/bind/annotation/GetMapping; value 
/dashboard	    
     +com/proyecto/PI09/service/SimulacionService ! " listarTodas ()Ljava/util/List; $ simulaciones & ( ' org/springframework/ui/Model ) * addAttribute D(Ljava/lang/String;Ljava/lang/Object;)Lorg/springframework/ui/Model;  model Lorg/springframework/ui/Model; Ljava/util/List; LocalVariableTypeTable 6Ljava/util/List<Lcom/proyecto/PI09/model/Simulacion;>; MethodParameters verPreguntas E(Ljava/lang/Integer;Lorg/springframework/ui/Model;)Ljava/lang/String; /simulacion/{id}/preguntas "RuntimeVisibleParameterAnnotations 6Lorg/springframework/web/bind/annotation/PathVariable;
  8 9 : buscarPorId )(Ljava/lang/Integer;)Ljava/util/Optional;
 < > = java/util/Optional ? @ isEmpty ()Z B redirect:/admin/dashboard
 < D E F get ()Ljava/lang/Object; H "com/proyecto/PI09/model/Simulacion	  J 	 

 L N M )com/proyecto/PI09/service/PreguntaService O P listarPorSimulacion 6(Lcom/proyecto/PI09/model/Simulacion;)Ljava/util/List; R 
simulacion T 	preguntas V admin-preguntas id Ljava/lang/Integer; simulacionOpt Ljava/util/Optional; $Lcom/proyecto/PI09/model/Simulacion; :Ljava/util/Optional<Lcom/proyecto/PI09/model/Simulacion;>; 4Ljava/util/List<Lcom/proyecto/PI09/model/Pregunta;>; StackMapTable nuevaPregunta  /simulacion/{id}/preguntas/nueva b pregunta d  com/proyecto/PI09/model/Pregunta
 c  g modo i crear k admin-pregunta-form guardarPregunta r(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;)Ljava/lang/String; 5Lorg/springframework/web/bind/annotation/PostMapping; "/simulacion/{id}/preguntas/guardar 6Lorg/springframework/web/bind/annotation/RequestParam; defaultValue 0 false
 c u v w setSimulacion '(Lcom/proyecto/PI09/model/Simulacion;)V
 c y z { setTexto (Ljava/lang/String;)V
 c } ~  setOrden (Ljava/lang/Integer;)V
 c  ‚ ƒ setEsInicial (Ljava/lang/Boolean;)V
 c … † ƒ 
setEsFinal
 ˆ Š ‰ java/lang/Boolean ‹ Œ valueOf (Z)Ljava/lang/Boolean;
 c Ž  ƒ 	setEstado
 L ‘ ’ “ guardar F(Lcom/proyecto/PI09/model/Pregunta;)Lcom/proyecto/PI09/model/Pregunta;
 • — – java/lang/String ‹ ˜ &(Ljava/lang/Object;)Ljava/lang/String;   š › œ makeConcatWithConstants &(Ljava/lang/String;)Ljava/lang/String; texto Ljava/lang/String; orden 	esInicial Ljava/lang/Boolean; esFinal "Lcom/proyecto/PI09/model/Pregunta; editarPregunta /pregunta/{id}/editar
 L 8
 c ¨ © ª getSimulacion &()Lcom/proyecto/PI09/model/Simulacion; ¬ editar preguntaOpt 8Ljava/util/Optional<Lcom/proyecto/PI09/model/Pregunta;>; actualizarPregunta /pregunta/{id}/actualizar
 G ² ³ ´ getIdSimulacion ()Ljava/lang/Integer;  š desactivarPregunta '(Ljava/lang/Integer;)Ljava/lang/String; /pregunta/{id}/desactivar
 L º »  
desactivar  š idSimulacion verAlternativas /pregunta/{id}/alternativas	  Á  
 Ã Å Ä ,com/proyecto/PI09/service/AlternativaService Æ Ç listarPorPregunta 4(Lcom/proyecto/PI09/model/Pregunta;)Ljava/util/List; É alternativas Ë preguntasSimulacion Í alternativa Ï #com/proyecto/PI09/model/Alternativa
 Î  Ò admin-alternativas preguntasMismaSimulacion 7Ljava/util/List<Lcom/proyecto/PI09/model/Alternativa;>; guardarAlternativa _(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)Ljava/lang/String; #/pregunta/{id}/alternativas/guardar required    
 Î Û Ü Ý setPregunta %(Lcom/proyecto/PI09/model/Pregunta;)V
 Î y
 Î à á  
setPuntaje
 Î Ž
  ä å æ getClass ()Ljava/lang/Class;  è é ê accept D(Lcom/proyecto/PI09/model/Alternativa;)Ljava/util/function/Consumer;
 < ì í î 	ifPresent  (Ljava/util/function/Consumer;)V
 Ã ð ’ ñ L(Lcom/proyecto/PI09/model/Alternativa;)Lcom/proyecto/PI09/model/Alternativa;  š puntaje idSiguientePregunta %Lcom/proyecto/PI09/model/Alternativa; siguienteOpt editarAlternativa /alternativa/{id}/editar
 Ã 8
 Î û ü ý getPregunta $()Lcom/proyecto/PI09/model/Pregunta; alternativaOpt ;Ljava/util/Optional<Lcom/proyecto/PI09/model/Alternativa;>; actualizarAlternativa /alternativa/{id}/actualizar
 < orElse &(Ljava/lang/Object;)Ljava/lang/Object;
 Î Ý setSiguientePregunta
 c
 ´ getIdPregunta  š desactivarAlternativa /alternativa/{id}/desactivar
 Ã º  š 
idPregunta 
SourceFile AdminController.java +Lorg/springframework/stereotype/Controller; 8Lorg/springframework/web/bind/annotation/RequestMapping; /admin BootstrapMethods
 $java/lang/invoke/StringConcatFactory › ˜(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; &redirect:/admin/simulacion//preguntas
!#" "java/lang/invoke/LambdaMetafactory$% metafactory Ì(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;  (Ljava/lang/Object;)V' Ý, 'redirect:/admin/pregunta//alternativas InnerClasses/ %java/lang/invoke/MethodHandles$Lookup1 java/lang/invoke/MethodHandles Lookup !                   	 
                              /     *· ±                                   [ s     m     *´ ¶ M+#,¹ % W+°           !  "  #                 , -    $ .  /       $ 0  1    ,    2 3         [ s 4 5   	  6        â     @*´ +¶ 7N-¶ ;™ A°-¶ CÀ G:*´ I¶ K:,Q¹ % W,S¹ % WU°       "    ( 	 *  +  .  / ' 1 2 2 = 3    >    @       @ W X    @ , -  	 7 Y Z   $ R [  '  T .  /     	 7 Y \  '  T ]  ^    ü  < 1   	 W   ,    _ 3         [ s ` 5   	  6        ¾     >*´ +¶ 7N-¶ ;™ A°,Q-¶ C¹ % W,a» cY· e¹ % W,fh¹ % Wj°           8 	 :  ;  >   ? 0 @ ; A    *    >       > W X    > , -  	 5 Y Z  /     	 5 Y \  ^    ü  < 1   	 W   ,    l m       n  [ s o 5   .  6    p    p  qs r  p  qs s  p  qs s        b*´ +¶ 7:¶ ;™ A°» cY· e:¶ CÀ G¶ t,¶ x-¶ |¶ €¶ „¸ ‡¶ *´ I¶ W+¸ ”º ™  °       2    K 
 M  N  Q  R + S 1 T 7 U > V E W N Y X [    R    b       b W X    b  ž    b Ÿ X    b   ¡    b ¢ ¡  
 X Y Z   D b £  /     
 X Y \  ^    ü  < 1    W      Ÿ       ¢    ¤ 3         [ s ¥ 5   	  6        Ñ     C*´ I+¶ ¦N-¶ ;™ A°-¶ CÀ c:,Q¶ §¹ % W,a¹ % W,f«¹ % Wj°       "    ` 	 b  c  f  g * h 5 i @ j    4    C       C W X    C , -  	 : ­ Z   ' b £  /     	 : ­ ®  ^    ü  < 1   	 W   ,    ¯ m       n  [ s ° 5   .  6    p    p  qs r  p  qs s  p  qs s        T*´ I+¶ ¦:¶ ;™ A°¶ CÀ c:,¶ x-¶ |¶ €¶ „*´ I¶ W¶ §¶ ±¸ ”º µ  °       * 
   t 
 v  w  z  { % | + } 2 ~ 9 € C ‚    R    T       T W X    T  ž    T Ÿ X    T   ¡    T ¢ ¡  
 J ­ Z   5 b £  /     
 J ­ ®  ^    ü  < 1    W      Ÿ       ¢    ¶ ·         [ s ¸ 5     6      ¯     3*´ I+¶ ¦M,¶ ;™ A°,¶ CÀ c¶ §¶ ±N*´ I+¶ ¹-¸ ”º ¼  °           ‡ 	 ‰  Š   ! Ž )     *    3       3 W X  	 * ­ Z  !  ½ X  /     	 * ­ ®  ^    ü  < 1    W    ¾ 3         [ s ¿ 5   	  6       :     t*´ I+¶ ¦N-¶ ;™ A°-¶ CÀ c:*´ À¶ Â:,a¹ % W,È¹ % W*´ I¶ §¶ K:,Ê¹ % W,Ì» ÎY· Ð¹ % W,fh¹ % WÑ°       2    • 	 —  ˜  ›  œ ' ž 2 Ÿ = ¡ K ¢ V ¤ f ¥ q §    H    t       t W X    t , -  	 k ­ Z   X b £  ' M É .  K ) Ó .  /      	 k ­ ®  ' M É Ô  K ) Ó ]  ^    ü  < 1   	 W   ,    Õ Ö       n  [ s × 5     6    p    p    p  ØZ Ù   Z  	   y*´ I+¶ ¦:¶ ;™ A°¶ CÀ c:» ÎY· Ð:¶ Ú,¶ Þ-¶ ß¸ ‡¶ âÆ *´ I¶ ¦:Y¶ ãWº ç  ¶ ë*´ À¶ ïW+¸ ”º ò  °       :    ° 
 ²  ³  ¶  ¸ ( ¹ / º 5 » ; ¼ D ¾ I ¿ T À e Ã o Å    \ 	   y       y W X    y  ž    y ó X    y ô X  
 o ­ Z   Z b £  ( Q Í õ  T  ö Z  /     
 o ­ ®  T  ö ®  ^    ü  <ý O c Î 1    W      ó   ô    ÷ 3         [ s ø 5   	  6            n*´ À+¶ ùN-¶ ;™ A°-¶ CÀ Î:¶ ú:,a¹ % W,È*´ À¶ Â¹ % W,Ê*´ I¶ §¶ K¹ % W,Ì¹ % W,f«¹ % WÑ°       .    Ê 	 Ì  Í  Ð  Ñ # Ó . Ô @ Õ U Ö ` × k Ù    >    n       n W X    n , -  	 e þ Z   R Í õ  # K b £  /     	 e þ ÿ  ^    ü  < 1   	 W   ,     Ö       n  [ s 5     6    p    p    p  ØZ Ù   >     m*´ À+¶ ù:¶ ;™ A°¶ CÀ Î:,¶ Þ-¶ ßÆ *´ I¶ ¦:¶À c¶§ 	¶*´ À¶ ïW¶ ú¶	¸ ”º  °       6    â 
 ä  å  è  é % ê + ì 0 í ; î I ï L ð R ó \ õ    R    m       m W X    m  ž    m ó X    m ô X  
 c þ Z   N Í õ  ;  ö Z  /     
 c þ ÿ  ;  ö ®  ^    ü  <ü 6 Î 1    W      ó   ô    ·         [ s 5     6      ¯     3*´ À+¶ ùM,¶ ;™ A°,¶ CÀ Î¶ ú¶	N*´ À+¶-¸ ”º  °           ú 	 ü  ý   ! )    *    3       3 W X  	 * þ Z  !  X  /     	 * þ ÿ  ^    ü  < 1    W               [ s   0    & ()* + + +-   
 .02 

---


<ruta> .\target\classes\com\proyecto\PI09\controller\SimulacionController.class
---
Êþº¾   = Ø  1com/proyecto/PI09/controller/SimulacionController  java/lang/Object simulacionService -Lcom/proyecto/PI09/service/SimulacionService; RuntimeVisibleAnnotations 8Lorg/springframework/beans/factory/annotation/Autowired; preguntaService +Lcom/proyecto/PI09/service/PreguntaService; alternativaService .Lcom/proyecto/PI09/service/AlternativaService; <init> ()V Code
     LineNumberTable LocalVariableTable this 3Lcom/proyecto/PI09/controller/SimulacionController; verSimulacion 2(Lorg/springframework/ui/Model;)Ljava/lang/String; 4Lorg/springframework/web/bind/annotation/GetMapping; value /simulacion	    
     +com/proyecto/PI09/service/SimulacionService ! " listarTodas ()Ljava/util/List; $ simulaciones & ( ' org/springframework/ui/Model ) * addAttribute D(Ljava/lang/String;Ljava/lang/Object;)Lorg/springframework/ui/Model; , preguntas-publico model Lorg/springframework/ui/Model; Ljava/util/List; LocalVariableTypeTable 6Ljava/util/List<Lcom/proyecto/PI09/model/Simulacion;>; MethodParameters iniciarSimulacion I(Ljava/lang/Integer;Ljakarta/servlet/http/HttpSession;)Ljava/lang/String; /simulacion/{id}/iniciar "RuntimeVisibleParameterAnnotations 6Lorg/springframework/web/bind/annotation/PathVariable;
  9 : ; buscarPorId )(Ljava/lang/Integer;)Ljava/util/Optional;
 = ? > java/util/Optional @ A isEmpty ()Z C redirect:/simulacion
 = E F G get ()Ljava/lang/Object; I "com/proyecto/PI09/model/Simulacion	  K 	 

 M O N )com/proyecto/PI09/service/PreguntaService P Q buscarPreguntaInicial :(Lcom/proyecto/PI09/model/Simulacion;)Ljava/util/Optional; S !redirect:/simulacion?sinPreguntas U puntajeTotal
 W Y X java/lang/Integer Z [ valueOf (I)Ljava/lang/Integer; ] _ ^  jakarta/servlet/http/HttpSession ` a setAttribute '(Ljava/lang/String;Ljava/lang/Object;)V c idSimulacionActual
 H e f g getIdSimulacion ()Ljava/lang/Integer; i  com/proyecto/PI09/model/Pregunta
 h k l g getIdPregunta
 n p o java/lang/String Z q &(Ljava/lang/Object;)Ljava/lang/String;   s t u makeConcatWithConstants &(Ljava/lang/String;)Ljava/lang/String; id Ljava/lang/Integer; session "Ljakarta/servlet/http/HttpSession; simulacionOpt Ljava/util/Optional; 
simulacion $Lcom/proyecto/PI09/model/Simulacion; preguntaInicialOpt :Ljava/util/Optional<Lcom/proyecto/PI09/model/Simulacion;>; 8Ljava/util/Optional<Lcom/proyecto/PI09/model/Pregunta;>; StackMapTable mostrarPregunta g(Ljava/lang/Integer;Lorg/springframework/ui/Model;Ljakarta/servlet/http/HttpSession;)Ljava/lang/String; !/simulacion/pregunta/{idPregunta}
 M 9	  ‡  
 ‰ ‹ Š ,com/proyecto/PI09/service/AlternativaService Œ  listarPorPregunta 4(Lcom/proyecto/PI09/model/Pregunta;)Ljava/util/List;  pregunta ‘ alternativas ] “ ” • getAttribute &(Ljava/lang/String;)Ljava/lang/Object; 
idPregunta preguntaOpt "Lcom/proyecto/PI09/model/Pregunta; puntaje Ljava/lang/Object; 7Ljava/util/List<Lcom/proyecto/PI09/model/Alternativa;>;  java/util/List responderPregunta 5Lorg/springframework/web/bind/annotation/PostMapping; /simulacion/responder 6Lorg/springframework/web/bind/annotation/RequestParam;
 ‰ 9 ¤ #com/proyecto/PI09/model/Alternativa
 W ¦ § ¨ intValue ()I
 £ ª « g 
getPuntaje
 £ ­ ® ¯ getSiguientePregunta $()Lcom/proyecto/PI09/model/Pregunta; ± redirect:/simulacion/resultado  s idAlternativa alternativaOpt alternativa %Lcom/proyecto/PI09/model/Alternativa; puntajeActual ;Ljava/util/Optional<Lcom/proyecto/PI09/model/Alternativa;>; mostrarResultado T(Lorg/springframework/ui/Model;Ljakarta/servlet/http/HttpSession;)Ljava/lang/String; /simulacion/resultado ½ mensaje ¿ 4Tu enfoque estÃ¡ orientado principalmente al precio. Á 0Tu enfoque busca equilibrio entre costo y valor. Ã 1Tu enfoque estÃ¡ orientado a calidad y confianza. Å 	resultado 
SourceFile SimulacionController.java +Lorg/springframework/stereotype/Controller; BootstrapMethods
 Ë Í Ì $java/lang/invoke/StringConcatFactory t Î ˜(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; Ê Ñ redirect:/simulacion/pregunta/ InnerClasses Ô %java/lang/invoke/MethodHandles$Lookup Ö java/lang/invoke/MethodHandles Lookup !                   	 
                              /     *· ±                                   [ s     m     *´ ¶ M+#,¹ % W+°           !  "  #                 - .    $ /  0       $ 1  2    -    3 4         [ s 5 6   	  7            _*´ +¶ 8N-¶ <™ B°-¶ DÀ H:*´ J¶ L:¶ <™ R°,T¸ V¹ \ ,b¶ d¹ \ ¶ DÀ h¶ j¸ mº r  °       * 
   ( 	 *  +  .  / ' 1 / 2 2 5 > 6 K 8    >    _       _ v w    _ x y  	 V z {   C | }  ' 8 ~ {  0     	 V z   ' 8 ~ €      ü  =ý  H = 2   	 v   x    ‚ ƒ         [ s „ 6     7         o     d*´ J+¶ …:¶ <™ B°¶ DÀ h:*´ †¶ ˆ:,Ž¹ % W,¹ % W-T¹ ’ :,TÇ 
¸ V§ ¹ % WŽ°       * 
   = 
 ?  @  C  D * F 5 G @ I J J a L    R    d       d – w    d - .    d x y  
 Z — {   E  ˜  * : ‘ /  J  ™ š  0     
 Z — €  * : ‘ ›     U ü  =ÿ C   W & ] = h œ   & nÿ    W & ] = h œ   & n  2    –   -   x    ž 4       Ÿ  [ s   6   	  ¡            m*´ †+¶ ¢N-¶ <™ B°-¶ DÀ £:,T¹ ’ À W:Ç 	¸ V:¶ ¥¶ ©¶ ¥`¸ V:,T¹ \ ¶ ¬Ç °°¶ ¬¶ j¸ mº ²  °       2    Q 	 S  T  W  Y ) Z . [ 4 ^ G _ Q a Y b \ e    >    m       m ³ w    m x y  	 d ´ {   Q µ ¶  ) D · w  0     	 d ´ ¸      ü  =ý   £ W' 2   	 ³   x    ¹ º         [ s »    Ü     [,T¹ ’ À WN-Ç ¸ VN+T-¹ % W-¶ ¥
£ +¼¾¹ % W§ %-¶ ¥£ +¼À¹ % W§ +¼Â¹ % WÄ°       .    j  l  m  p  r ( s 3 t ? u J v M w X z    *    [       [ - .    [ x y   O U w      ü  W 
 2   	 -   x    Æ    Ç      È   É     Ï  Ð Ï  Ð Ò   
  Ó Õ × 

---


<ruta> .\target\classes\com\proyecto\PI09\controller\UsuarioController.class
---
Êþº¾   = y  .com/proyecto/PI09/controller/UsuarioController  java/lang/Object usuarioService *Lcom/proyecto/PI09/service/UsuarioService; RuntimeVisibleAnnotations 8Lorg/springframework/beans/factory/annotation/Autowired; <init> ()V Code
   	 
 LineNumberTable LocalVariableTable this 0Lcom/proyecto/PI09/controller/UsuarioController; inicio ()Ljava/lang/String; 4Lorg/springframework/web/bind/annotation/GetMapping; value /  redirect:/login login /login  acceder Z(Ljava/lang/String;Ljava/lang/String;Ljakarta/servlet/http/HttpSession;)Ljava/lang/String; 5Lorg/springframework/web/bind/annotation/PostMapping; "RuntimeVisibleParameterAnnotations 6Lorg/springframework/web/bind/annotation/RequestParam;	  "  
 $ & % (com/proyecto/PI09/service/UsuarioService ' ( validarLogin G(Ljava/lang/String;Ljava/lang/String;)Lcom/proyecto/PI09/model/Usuario; * usuarioLogueado , . -  jakarta/servlet/http/HttpSession / 0 setAttribute '(Ljava/lang/String;Ljava/lang/Object;)V 2 ADMIN
 4 6 5 com/proyecto/PI09/model/Usuario 7 8 getRol ()Lcom/proyecto/PI09/model/Rol;
 : < ; com/proyecto/PI09/model/Rol =  getNombreRol
 ? A @ java/lang/String B C equalsIgnoreCase (Ljava/lang/String;)Z E redirect:/admin/dashboard G redirect:/simulacion I redirect:/login?error correo Ljava/lang/String; password session "Ljakarta/servlet/http/HttpSession; user !Lcom/proyecto/PI09/model/Usuario; StackMapTable MethodParameters registro 	/registro S guardarRegistro \(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
 $ Y Z W registrarUsuario \ CORREO_INVALIDO
 ? ^ _ ` equals (Ljava/lang/Object;)Z b redirect:/registro?errorCorreo d CORREO_EXISTENTE f redirect:/registro?correoExiste h ROL_NO_EXISTE j redirect:/registro?errorRol l redirect:/login?registroExitoso nombre apellido 	resultado salir 6(Ljakarta/servlet/http/HttpSession;)Ljava/lang/String; /logout , t u 
 
invalidate 
SourceFile UsuarioController.java +Lorg/springframework/stereotype/Controller; !                    	 
     /     *· ±                                   [ s     -     °                                   [ s     -     °                                   [ s                     ¬     3*´ !+,¶ #:Æ #-)¹ + 1¶ 3¶ 9¶ >™ D°F°H°           "  $  %  ' * ( - * 0 .    4    3       3 J K    3 L K    3 M N   ( O P  Q   	 ü - 4 R    J   L   M    S          [ s T    -     U°           3              V W         [ s T                            À     8*´ !+,-¶ X:[¶ ]™ a°c¶ ]™ e°g¶ ]™ i°k°       "    <  >  ?  B % C ( F 2 G 5 J    >    8       8 m K    8 n K    8 J K    8 L K   * o K  Q   
 ü  ? R    m   n   J   L    p q         [ s r    A     	+¹ s °       
    O  P        	       	 M N  R    M    v    w      x  

---


<ruta> .\target\classes\com\proyecto\PI09\controller\WatsonController.class
---
Êþº¾   = g  -com/proyecto/PI09/controller/WatsonController  java/lang/Object watsonProperties +Lcom/proyecto/PI09/config/WatsonProperties; <init> .(Lcom/proyecto/PI09/config/WatsonProperties;)V Code
     ()V	     LineNumberTable LocalVariableTable this /Lcom/proyecto/PI09/controller/WatsonController; MethodParameters 	getConfig +()Lorg/springframework/http/ResponseEntity; 	Signature b()Lorg/springframework/http/ResponseEntity<Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;>; RuntimeVisibleAnnotations 4Lorg/springframework/web/bind/annotation/GetMapping; value /config
    )com/proyecto/PI09/config/WatsonProperties   ! getColor 3()Lcom/proyecto/PI09/config/WatsonProperties$Color; # 	watsonUrl
  % & ' getUrl ()Ljava/lang/String; ) primary
 + - , /com/proyecto/PI09/config/WatsonProperties$Color . ' 
getPrimary 0 primaryHover
 + 2 3 ' getPrimaryHover 5 bgLight
 + 7 8 ' 
getBgLight : bgDark
 + < = ' 	getBgDark ? textPrimary
 + A B ' getTextPrimary D textSecondary
 + F G ' getTextSecondary I border
 + K L ' 	getBorder N badge
 + P Q ' getBadge S U T java/util/Map V W ofU(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;
 Y [ Z 'org/springframework/http/ResponseEntity \ ] ok =(Ljava/lang/Object;)Lorg/springframework/http/ResponseEntity; c 1Lcom/proyecto/PI09/config/WatsonProperties$Color; 
SourceFile WatsonController.java 8Lorg/springframework/web/bind/annotation/RestController; 8Lorg/springframework/web/bind/annotation/RequestMapping; /api/watson InnerClasses Color !                	   F     
*· 
*+µ ±              	         
       
                           [ s  	   ¤     H*´ ¶ L"*´ ¶ $(+¶ */+¶ 14+¶ 69+¶ ;>+¶ @C+¶ EH+¶ JM+¶ O¸ R¸ X°       .             #  )  /  5   ; ! A         H      @ ^ _   `    a      b   c  [ s d e   
  +  f 	

---


<ruta> .\target\classes\com\proyecto\PI09\model\Alternativa.class
---
Êþº¾   = n  #com/proyecto/PI09/model/Alternativa  java/lang/Object idAlternativa Ljava/lang/Integer; RuntimeVisibleAnnotations Ljakarta/persistence/Id; $Ljakarta/persistence/GeneratedValue; strategy $Ljakarta/persistence/GenerationType; IDENTITY Ljakarta/persistence/Column; name id_alternativa pregunta "Lcom/proyecto/PI09/model/Pregunta; Ljakarta/persistence/ManyToOne; fetch Ljakarta/persistence/FetchType; EAGER  Ljakarta/persistence/JoinColumn; id_pregunta nullable     texto Ljava/lang/String; length   ÿ puntaje siguientePregunta id_siguiente_pregunta estado Ljava/lang/Boolean; fechaCreacion Ljava/time/LocalDateTime; fecha_creacion <init> ()V Code
  * & ' LineNumberTable LocalVariableTable this %Lcom/proyecto/PI09/model/Alternativa; 
prePersist  Ljakarta/persistence/PrePersist;	  2 # $
 4 6 5 java/time/LocalDateTime 7 8 now ()Ljava/time/LocalDateTime;	  : ! "
 < > = java/lang/Boolean ? @ valueOf (Z)Ljava/lang/Boolean;	  B  
 D F E java/lang/Integer ? G (I)Ljava/lang/Integer; StackMapTable getIdAlternativa ()Ljava/lang/Integer;	  L   setIdAlternativa (Ljava/lang/Integer;)V MethodParameters getPregunta $()Lcom/proyecto/PI09/model/Pregunta;	  S   setPregunta %(Lcom/proyecto/PI09/model/Pregunta;)V getTexto ()Ljava/lang/String;	  Y   setTexto (Ljava/lang/String;)V 
getPuntaje 
setPuntaje getSiguientePregunta	  `   setSiguientePregunta 	getEstado ()Ljava/lang/Boolean; 	setEstado (Ljava/lang/Boolean;)V getFechaCreacion setFechaCreacion (Ljava/time/LocalDateTime;)V 
SourceFile Alternativa.java Ljakarta/persistence/Entity; Ljakarta/persistence/Table; alternativa !                  	  
e     s             e     s  Z             s  Z  I             s  Z             e     s    ! "         s ! Z   # $         s % Z    & '  (   3     *· )±    +   
    -  . ,        - .    / '       0   (   z     -*´ 1Ç 
*¸ 3µ 1*´ 9Ç *¸ ;µ 9*´ AÇ *¸ Cµ A±    +       2  3  5  6  8 $ 9 , ; ,       - - .   H      I J  (   /     *´ K°    +       > ,        - .    M N  (   >     *+µ K±    +   
    B  C ,        - .         O        P Q  (   /     *´ R°    +       F ,        - .    T U  (   >     *+µ R±    +   
    J  K ,        - .         O        V W  (   /     *´ X°    +       N ,        - .    Z [  (   >     *+µ X±    +   
    R  S ,        - .         O        \ J  (   /     *´ A°    +       V ,        - .    ] N  (   >     *+µ A±    +   
    Z  [ ,        - .         O        ^ Q  (   /     *´ _°    +       ^ ,        - .    a U  (   >     *+µ _±    +   
    b  c ,        - .         O        b c  (   /     *´ 9°    +       f ,        - .    d e  (   >     *+µ 9±    +   
    j  k ,        - .      ! "  O    !    f 8  (   /     *´ 1°    +       n ,        - .    g h  (   >     *+µ 1±    +   
    r  s ,        - .      # $  O    #    i    j      k   l  s m

---


<ruta> .\target\classes\com\proyecto\PI09\model\IntentoSimulacion.class
---
Êþº¾   =   )com/proyecto/PI09/model/IntentoSimulacion  java/lang/Object <init> ()V Code
  	   LineNumberTable LocalVariableTable this +Lcom/proyecto/PI09/model/IntentoSimulacion; 
SourceFile IntentoSimulacion.java !               /     *· ±    
                         

---


<ruta> .\target\classes\com\proyecto\PI09\model\Perfil.class
---
Êþº¾   =   com/proyecto/PI09/model/Perfil  java/lang/Object <init> ()V Code
  	   LineNumberTable LocalVariableTable this  Lcom/proyecto/PI09/model/Perfil; 
SourceFile Perfil.java !               /     *· ±    
                         

---


<ruta> .\target\classes\com\proyecto\PI09\model\Pregunta.class
---
Êþº¾   = o   com/proyecto/PI09/model/Pregunta  java/lang/Object 
idPregunta Ljava/lang/Integer; RuntimeVisibleAnnotations Ljakarta/persistence/Id; $Ljakarta/persistence/GeneratedValue; strategy $Ljakarta/persistence/GenerationType; IDENTITY Ljakarta/persistence/Column; name id_pregunta 
simulacion $Lcom/proyecto/PI09/model/Simulacion; Ljakarta/persistence/ManyToOne; fetch Ljakarta/persistence/FetchType; EAGER  Ljakarta/persistence/JoinColumn; id_simulacion nullable     texto Ljava/lang/String; length   ÿ orden 	esInicial Ljava/lang/Boolean; 
es_inicial esFinal es_final estado fechaCreacion Ljava/time/LocalDateTime; fecha_creacion <init> ()V Code
  , ( ) LineNumberTable LocalVariableTable this "Lcom/proyecto/PI09/model/Pregunta; 
prePersist  Ljakarta/persistence/PrePersist;	  4 % &
 6 8 7 java/time/LocalDateTime 9 : now ()Ljava/time/LocalDateTime;	  < $  
 > @ ? java/lang/Boolean A B valueOf (Z)Ljava/lang/Boolean;	  D   	  F "   StackMapTable getIdPregunta ()Ljava/lang/Integer;	  K   setIdPregunta (Ljava/lang/Integer;)V MethodParameters getSimulacion &()Lcom/proyecto/PI09/model/Simulacion;	  R   setSimulacion '(Lcom/proyecto/PI09/model/Simulacion;)V getTexto ()Ljava/lang/String;	  X   setTexto (Ljava/lang/String;)V getOrden	  ]   setOrden getEsInicial ()Ljava/lang/Boolean; setEsInicial (Ljava/lang/Boolean;)V 
getEsFinal 
setEsFinal 	getEstado 	setEstado getFechaCreacion setFechaCreacion (Ljava/time/LocalDateTime;)V 
SourceFile Pregunta.java Ljakarta/persistence/Entity; Ljakarta/persistence/Table; pregunta !                  	  
e     s             e     s  Z             s  Z  I             s              s ! Z   "           s # Z   $           s $ Z   % &         s ' Z    ( )  *   3     *· +±    -   
    /  0 .        / 0    1 )       2   *   ’     <*´ 3Ç 
*¸ 5µ 3*´ ;Ç *¸ =µ ;*´ CÇ *¸ =µ C*´ EÇ *¸ =µ E±    -   & 	   4  5  7  8  : $ ; , = 3 > ; @ .       < / 0   G      H I  *   /     *´ J°    -       C .        / 0    L M  *   >     *+µ J±    -   
    G  H .        / 0         N        O P  *   /     *´ Q°    -       K .        / 0    S T  *   >     *+µ Q±    -   
    O  P .        / 0         N        U V  *   /     *´ W°    -       S .        / 0    Y Z  *   >     *+µ W±    -   
    W  X .        / 0         N        [ I  *   /     *´ \°    -       [ .        / 0    ^ M  *   >     *+µ \±    -   
    _  ` .        / 0         N        _ `  *   /     *´ C°    -       c .        / 0    a b  *   >     *+µ C±    -   
    g  h .        / 0          N        c `  *   /     *´ E°    -       k .        / 0    d b  *   >     *+µ E±    -   
    o  p .        / 0      "    N    "    e `  *   /     *´ ;°    -       s .        / 0    f b  *   >     *+µ ;±    -   
    w  x .        / 0      $    N    $    g :  *   /     *´ 3°    -       { .        / 0    h i  *   >     *+µ 3±    -   
      € .        / 0      % &  N    %    j    k      l   m  s n

---


<ruta> .\target\classes\com\proyecto\PI09\model\RespuestaUsuario.class
---
Êþº¾   =   (com/proyecto/PI09/model/RespuestaUsuario  java/lang/Object <init> ()V Code
  	   LineNumberTable LocalVariableTable this *Lcom/proyecto/PI09/model/RespuestaUsuario; 
SourceFile RespuestaUsuario.java !               /     *· ±    
                         

---


<ruta> .\target\classes\com\proyecto\PI09\model\ResultadoFinal.class
---
Êþº¾   =   &com/proyecto/PI09/model/ResultadoFinal  java/lang/Object <init> ()V Code
  	   LineNumberTable LocalVariableTable this (Lcom/proyecto/PI09/model/ResultadoFinal; 
SourceFile ResultadoFinal.java !               /     *· ±    
                         

---


<ruta> .\target\classes\com\proyecto\PI09\model\Rol.class
---
Êþº¾   = 4  com/proyecto/PI09/model/Rol  java/lang/Object idRol Ljava/lang/Integer; RuntimeVisibleAnnotations Ljakarta/persistence/Id; $Ljakarta/persistence/GeneratedValue; strategy $Ljakarta/persistence/GenerationType; IDENTITY Ljakarta/persistence/Column; name id_rol 	nombreRol Ljava/lang/String; 
nombre_rol nullable     unique    length    <init> ()V Code
     LineNumberTable LocalVariableTable this Lcom/proyecto/PI09/model/Rol; getIdRol ()Ljava/lang/Integer;	  %   setIdRol (Ljava/lang/Integer;)V MethodParameters getNombreRol ()Ljava/lang/String;	  ,   setNombreRol (Ljava/lang/String;)V 
SourceFile Rol.java Ljakarta/persistence/Entity; Ljakarta/persistence/Table; rol !                  	  
e     s             s  Z  Z  I          3     *· ±       
                 !    " #     /     *´ $°                      !    & '     >     *+µ $±       
                 !         (        ) *     /     *´ +°           "           !    - .     >     *+µ +±       
    &  '           !         (        /    0      1   2  s 3

---


<ruta> .\target\classes\com\proyecto\PI09\model\Simulacion.class
---
Êþº¾   = V  "com/proyecto/PI09/model/Simulacion  java/lang/Object idSimulacion Ljava/lang/Integer; RuntimeVisibleAnnotations Ljakarta/persistence/Id; $Ljakarta/persistence/GeneratedValue; strategy $Ljakarta/persistence/GenerationType; IDENTITY Ljakarta/persistence/Column; name id_simulacion titulo Ljava/lang/String; nullable     length   – descripcion   ÿ estado Ljava/lang/Boolean; fechaCreacion Ljava/time/LocalDateTime; fecha_creacion <init> ()V Code
  !   LineNumberTable LocalVariableTable this $Lcom/proyecto/PI09/model/Simulacion; 
prePersist  Ljakarta/persistence/PrePersist;	  )  
 + - , java/time/LocalDateTime . / now ()Ljava/time/LocalDateTime;	  1  
 3 5 4 java/lang/Boolean 6 7 valueOf (Z)Ljava/lang/Boolean; StackMapTable getIdSimulacion ()Ljava/lang/Integer;	  <   setIdSimulacion (Ljava/lang/Integer;)V MethodParameters 	getTitulo ()Ljava/lang/String;	  C   	setTitulo (Ljava/lang/String;)V getDescripcion	  H   setDescripcion 	getEstado ()Ljava/lang/Boolean; 	setEstado (Ljava/lang/Boolean;)V getFechaCreacion setFechaCreacion (Ljava/time/LocalDateTime;)V 
SourceFile Simulacion.java Ljakarta/persistence/Entity; Ljakarta/persistence/Table; 
simulacion !                  	  
e     s             s  Z  I             s  I             s  Z             s  Z          3     *·  ±    "   
    "  # #        $ %    &        '      b     *´ (Ç 
*¸ *µ (*´ 0Ç *¸ 2µ 0±    "       '  (  *  +  - #        $ %   8      9 :     /     *´ ;°    "       0 #        $ %    = >     >     *+µ ;±    "   
    4  5 #        $ %         ?        @ A     /     *´ B°    "       8 #        $ %    D E     >     *+µ B±    "   
    <  = #        $ %         ?        F A     /     *´ G°    "       @ #        $ %    I E     >     *+µ G±    "   
    D  E #        $ %         ?        J K     /     *´ 0°    "       H #        $ %    L M     >     *+µ 0±    "   
    L  M #        $ %         ?        N /     /     *´ (°    "       P #        $ %    O P     >     *+µ (±    "   
    T  U #        $ %         ?        Q    R      S   T  s U

---


<ruta> .\target\classes\com\proyecto\PI09\model\Usuario.class
---
Êþº¾   = q  com/proyecto/PI09/model/Usuario  java/lang/Object 	idUsuario Ljava/lang/Integer; RuntimeVisibleAnnotations Ljakarta/persistence/Id; $Ljakarta/persistence/GeneratedValue; strategy $Ljakarta/persistence/GenerationType; IDENTITY Ljakarta/persistence/Column; name 
id_usuario nombre Ljava/lang/String; nullable     length   < apellido correo unique      d password   ÿ estado Ljava/lang/Boolean; rol Lcom/proyecto/PI09/model/Rol; Ljakarta/persistence/ManyToOne; fetch Ljakarta/persistence/FetchType; EAGER  Ljakarta/persistence/JoinColumn; id_rol fechaRegistro Ljava/time/LocalDateTime; fecha_registro <init> ()V Code
  . * + LineNumberTable LocalVariableTable this !Lcom/proyecto/PI09/model/Usuario; 
prePersist  Ljakarta/persistence/PrePersist;	  6 ' (
 8 : 9 java/time/LocalDateTime ; < now ()Ljava/time/LocalDateTime;	  >  
 @ B A java/lang/Boolean C D valueOf (Z)Ljava/lang/Boolean; StackMapTable getIdUsuario ()Ljava/lang/Integer;	  I   setIdUsuario (Ljava/lang/Integer;)V MethodParameters 	getNombre ()Ljava/lang/String;	  P   	setNombre (Ljava/lang/String;)V getApellido	  U   setApellido 	getCorreo	  Y   	setCorreo getPassword	  ]   setPassword 	getEstado ()Ljava/lang/Boolean; 	setEstado (Ljava/lang/Boolean;)V getRol ()Lcom/proyecto/PI09/model/Rol;	  f    setRol  (Lcom/proyecto/PI09/model/Rol;)V getFechaRegistro setFechaRegistro (Ljava/time/LocalDateTime;)V 
SourceFile Usuario.java Ljakarta/persistence/Entity; Ljakarta/persistence/Table; usuario !                  	  
e     s             s  Z  I             s  Z  I             s  Z  Z  I             s  Z  I             s  Z            !  "e # $ %  s & Z   ' (         s ) Z    * +  ,   3     *· -±    /   
    1  2 0        1 2    3 +       4   ,   b     *´ 5Ç 
*¸ 7µ 5*´ =Ç *¸ ?µ =±    /       6  7  9  :  < 0        1 2   E      F G  ,   /     *´ H°    /       ? 0        1 2    J K  ,   >     *+µ H±    /   
    C  D 0        1 2         L        M N  ,   /     *´ O°    /       G 0        1 2    Q R  ,   >     *+µ O±    /   
    K  L 0        1 2         L        S N  ,   /     *´ T°    /       O 0        1 2    V R  ,   >     *+µ T±    /   
    S  T 0        1 2         L        W N  ,   /     *´ X°    /       W 0        1 2    Z R  ,   >     *+µ X±    /   
    [  \ 0        1 2         L        [ N  ,   /     *´ \°    /       _ 0        1 2    ^ R  ,   >     *+µ \±    /   
    c  d 0        1 2         L        _ `  ,   /     *´ =°    /       g 0        1 2    a b  ,   >     *+µ =±    /   
    k  l 0        1 2         L        c d  ,   /     *´ e°    /       o 0        1 2    g h  ,   >     *+µ e±    /   
    s  t 0        1 2          L        i <  ,   /     *´ 5°    /       w 0        1 2    j k  ,   >     *+µ 5±    /   
    {  | 0        1 2      ' (  L    '    l    m      n   o  s p

---


<ruta> .\target\classes\com\proyecto\PI09\repository\AlternativaRepository.class
---
Êþº¾   =   2com/proyecto/PI09/repository/AlternativaRepository  java/lang/Object  5org/springframework/data/jpa/repository/JpaRepository findByPreguntaAndEstadoTrue 4(Lcom/proyecto/PI09/model/Pregunta;)Ljava/util/List; 	Signature [(Lcom/proyecto/PI09/model/Pregunta;)Ljava/util/List<Lcom/proyecto/PI09/model/Alternativa;>; pregunta MethodParameters 
SourceFile AlternativaRepository.java ƒLjava/lang/Object;Lorg/springframework/data/jpa/repository/JpaRepository<Lcom/proyecto/PI09/model/Alternativa;Ljava/lang/Integer;>;           	    
              	    

---


<ruta> .\target\classes\com\proyecto\PI09\repository\IntentoSimulacionRepository.class
---
Êþº¾   =   8com/proyecto/PI09/repository/IntentoSimulacionRepository  java/lang/Object 
SourceFile  IntentoSimulacionRepository.java              

---


<ruta> .\target\classes\com\proyecto\PI09\repository\PreguntaRepository.class
---
Êþº¾   =   /com/proyecto/PI09/repository/PreguntaRepository  java/lang/Object  5org/springframework/data/jpa/repository/JpaRepository findBySimulacionAndEstadoTrue 6(Lcom/proyecto/PI09/model/Simulacion;)Ljava/util/List; 	Signature Z(Lcom/proyecto/PI09/model/Simulacion;)Ljava/util/List<Lcom/proyecto/PI09/model/Pregunta;>; 
simulacion MethodParameters -findBySimulacionAndEsInicialTrueAndEstadoTrue :(Lcom/proyecto/PI09/model/Simulacion;)Ljava/util/Optional; ^(Lcom/proyecto/PI09/model/Simulacion;)Ljava/util/Optional<Lcom/proyecto/PI09/model/Pregunta;>; 
SourceFile PreguntaRepository.java €Ljava/lang/Object;Lorg/springframework/data/jpa/repository/JpaRepository<Lcom/proyecto/PI09/model/Pregunta;Ljava/lang/Integer;>;           	    
           	                  	    

---


<ruta> .\target\classes\com\proyecto\PI09\repository\RespuestaUsuarioRepository.class
---
Êþº¾   =   7com/proyecto/PI09/repository/RespuestaUsuarioRepository  java/lang/Object 
SourceFile RespuestaUsuarioRepository.java              

---


<ruta> .\target\classes\com\proyecto\PI09\repository\RolRepository.class
---
Êþº¾   =   *com/proyecto/PI09/repository/RolRepository  java/lang/Object  5org/springframework/data/jpa/repository/JpaRepository findByNombreRol ((Ljava/lang/String;)Ljava/util/Optional; 	Signature G(Ljava/lang/String;)Ljava/util/Optional<Lcom/proyecto/PI09/model/Rol;>; 	nombreRol MethodParameters 
SourceFile RolRepository.java {Ljava/lang/Object;Lorg/springframework/data/jpa/repository/JpaRepository<Lcom/proyecto/PI09/model/Rol;Ljava/lang/Integer;>;           	    
              	    

---


<ruta> .\target\classes\com\proyecto\PI09\repository\SimulacionRepository.class
---
Êþº¾   =   1com/proyecto/PI09/repository/SimulacionRepository  java/lang/Object  5org/springframework/data/jpa/repository/JpaRepository 
SourceFile SimulacionRepository.java 	Signature ‚Ljava/lang/Object;Lorg/springframework/data/jpa/repository/JpaRepository<Lcom/proyecto/PI09/model/Simulacion;Ljava/lang/Integer;>;               	    


---


<ruta> .\target\classes\com\proyecto\PI09\repository\UsuarioRepository.class
---
Êþº¾   =   .com/proyecto/PI09/repository/UsuarioRepository  java/lang/Object  5org/springframework/data/jpa/repository/JpaRepository findByCorreo ((Ljava/lang/String;)Ljava/util/Optional; 	Signature K(Ljava/lang/String;)Ljava/util/Optional<Lcom/proyecto/PI09/model/Usuario;>; correo MethodParameters findByCorreoAndPassword :(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Optional; ](Ljava/lang/String;Ljava/lang/String;)Ljava/util/Optional<Lcom/proyecto/PI09/model/Usuario;>; password 
SourceFile UsuarioRepository.java Ljava/lang/Object;Lorg/springframework/data/jpa/repository/JpaRepository<Lcom/proyecto/PI09/model/Usuario;Ljava/lang/Integer;>;           	    
           	        	             	    

---


<ruta> .\target\classes\com\proyecto\PI09\service\AlternativaService.class
---
Êþº¾   = Q  ,com/proyecto/PI09/service/AlternativaService  java/lang/Object alternativaRepository 4Lcom/proyecto/PI09/repository/AlternativaRepository; RuntimeVisibleAnnotations 8Lorg/springframework/beans/factory/annotation/Autowired; <init> ()V Code
   	 
 LineNumberTable LocalVariableTable this .Lcom/proyecto/PI09/service/AlternativaService; listarPorPregunta 4(Lcom/proyecto/PI09/model/Pregunta;)Ljava/util/List; 	Signature [(Lcom/proyecto/PI09/model/Pregunta;)Ljava/util/List<Lcom/proyecto/PI09/model/Alternativa;>;	        2com/proyecto/PI09/repository/AlternativaRepository   findByPreguntaAndEstadoTrue pregunta "Lcom/proyecto/PI09/model/Pregunta; MethodParameters buscarPorId )(Ljava/lang/Integer;)Ljava/util/Optional; P(Ljava/lang/Integer;)Ljava/util/Optional<Lcom/proyecto/PI09/model/Alternativa;>;  $ % & findById ((Ljava/lang/Object;)Ljava/util/Optional; id Ljava/lang/Integer; guardar L(Lcom/proyecto/PI09/model/Alternativa;)Lcom/proyecto/PI09/model/Alternativa;  , - . save &(Ljava/lang/Object;)Ljava/lang/Object; 0 #com/proyecto/PI09/model/Alternativa alternativa %Lcom/proyecto/PI09/model/Alternativa; 
desactivar (Ljava/lang/Integer;)V
 6 8 7 java/util/Optional 9 : 	isPresent ()Z
 6 < = > get ()Ljava/lang/Object;
 @ B A java/lang/Boolean C D valueOf (Z)Ljava/lang/Boolean;
 / F G H 	setEstado (Ljava/lang/Boolean;)V alternativaOpt Ljava/util/Optional; LocalVariableTypeTable ;Ljava/util/Optional<Lcom/proyecto/PI09/model/Alternativa;>; StackMapTable 
SourceFile AlternativaService.java (Lorg/springframework/stereotype/Service; !                    	 
     /     *· ±                                    ?     *´ +¹  °                                        !      "    ?     *´ +¹ # °                           ' (      '    ) *     B     *´ +¹ + À /°                           1 2      1    3 4     ª     .*´ +¹ # M,¶ 5™ ,¶ ;À /N-¸ ?¶ E*´ -¹ + W±              !  "  # " $ - &    *    .       . ' (   # I J    1 2  K      # I L  M    ü - 6     '    N    O      P  

---


<ruta> .\target\classes\com\proyecto\PI09\service\IntentoSimulacionService.class
---
Êþº¾   =   2com/proyecto/PI09/service/IntentoSimulacionService  java/lang/Object <init> ()V Code
  	   LineNumberTable LocalVariableTable this 4Lcom/proyecto/PI09/service/IntentoSimulacionService; 
SourceFile IntentoSimulacionService.java !               /     *· ±    
                         

---


<ruta> .\target\classes\com\proyecto\PI09\service\PreguntaService.class
---
Êþº¾   = W  )com/proyecto/PI09/service/PreguntaService  java/lang/Object preguntaRepository 1Lcom/proyecto/PI09/repository/PreguntaRepository; RuntimeVisibleAnnotations 8Lorg/springframework/beans/factory/annotation/Autowired; <init> ()V Code
   	 
 LineNumberTable LocalVariableTable this +Lcom/proyecto/PI09/service/PreguntaService; listarPorSimulacion 6(Lcom/proyecto/PI09/model/Simulacion;)Ljava/util/List; 	Signature Z(Lcom/proyecto/PI09/model/Simulacion;)Ljava/util/List<Lcom/proyecto/PI09/model/Pregunta;>;	        /com/proyecto/PI09/repository/PreguntaRepository   findBySimulacionAndEstadoTrue 
simulacion $Lcom/proyecto/PI09/model/Simulacion; MethodParameters buscarPorId )(Ljava/lang/Integer;)Ljava/util/Optional; M(Ljava/lang/Integer;)Ljava/util/Optional<Lcom/proyecto/PI09/model/Pregunta;>;  $ % & findById ((Ljava/lang/Object;)Ljava/util/Optional; id Ljava/lang/Integer; buscarPreguntaInicial :(Lcom/proyecto/PI09/model/Simulacion;)Ljava/util/Optional; ^(Lcom/proyecto/PI09/model/Simulacion;)Ljava/util/Optional<Lcom/proyecto/PI09/model/Pregunta;>;  - . * -findBySimulacionAndEsInicialTrueAndEstadoTrue guardar F(Lcom/proyecto/PI09/model/Pregunta;)Lcom/proyecto/PI09/model/Pregunta;  2 3 4 save &(Ljava/lang/Object;)Ljava/lang/Object; 6  com/proyecto/PI09/model/Pregunta pregunta "Lcom/proyecto/PI09/model/Pregunta; 
desactivar (Ljava/lang/Integer;)V
 < > = java/util/Optional ? @ 	isPresent ()Z
 < B C D get ()Ljava/lang/Object;
 F H G java/lang/Boolean I J valueOf (Z)Ljava/lang/Boolean;
 5 L M N 	setEstado (Ljava/lang/Boolean;)V preguntaOpt Ljava/util/Optional; LocalVariableTypeTable 8Ljava/util/Optional<Lcom/proyecto/PI09/model/Pregunta;>; StackMapTable 
SourceFile PreguntaService.java (Lorg/springframework/stereotype/Service; !                    	 
     /     *· ±                                    ?     *´ +¹  °                                        !      "    ?     *´ +¹ # °                           ' (      '    ) *      +    ?     *´ +¹ , °                                      / 0     B     *´ +¹ 1 À 5°                            7 8      7    9 :     ª     .*´ +¹ # M,¶ ;™ ,¶ AÀ 5N-¸ E¶ K*´ -¹ 1 W±           $  %  &  ' " ( - *    *    .       . ' (   # O P    7 8  Q      # O R  S    ü - <     '    T    U      V  

---


<ruta> .\target\classes\com\proyecto\PI09\service\SimulacionService.class
---
Êþº¾   = 4  +com/proyecto/PI09/service/SimulacionService  java/lang/Object simulacionRepository 3Lcom/proyecto/PI09/repository/SimulacionRepository; RuntimeVisibleAnnotations 8Lorg/springframework/beans/factory/annotation/Autowired; <init> ()V Code
   	 
 LineNumberTable LocalVariableTable this -Lcom/proyecto/PI09/service/SimulacionService; listarTodas ()Ljava/util/List; 	Signature 8()Ljava/util/List<Lcom/proyecto/PI09/model/Simulacion;>;	        1com/proyecto/PI09/repository/SimulacionRepository   findAll buscarPorId )(Ljava/lang/Integer;)Ljava/util/Optional; O(Ljava/lang/Integer;)Ljava/util/Optional<Lcom/proyecto/PI09/model/Simulacion;>;  ! " # findById ((Ljava/lang/Object;)Ljava/util/Optional; id Ljava/lang/Integer; MethodParameters guardar J(Lcom/proyecto/PI09/model/Simulacion;)Lcom/proyecto/PI09/model/Simulacion;  * + , save &(Ljava/lang/Object;)Ljava/lang/Object; . "com/proyecto/PI09/model/Simulacion 
simulacion $Lcom/proyecto/PI09/model/Simulacion; 
SourceFile SimulacionService.java (Lorg/springframework/stereotype/Service; !                    	 
     /     *· ±                                    4     
*´ ¹  °                   
                 ?     *´ +¹   °                           $ %  &    $    ' (     B     *´ +¹ ) À -°                           / 0  &    /    1    2      3  

---


<ruta> .\target\classes\com\proyecto\PI09\service\UsuarioService.class
---
Êþº¾   = †  (com/proyecto/PI09/service/UsuarioService  java/lang/Object usuarioRepository 0Lcom/proyecto/PI09/repository/UsuarioRepository; RuntimeVisibleAnnotations 8Lorg/springframework/beans/factory/annotation/Autowired; rolRepository ,Lcom/proyecto/PI09/repository/RolRepository; <init> ()V Code
     LineNumberTable LocalVariableTable this *Lcom/proyecto/PI09/service/UsuarioService; buscarPorCorreo ((Ljava/lang/String;)Ljava/util/Optional; 	Signature K(Ljava/lang/String;)Ljava/util/Optional<Lcom/proyecto/PI09/model/Usuario;>;	        .com/proyecto/PI09/repository/UsuarioRepository   findByCorreo correo Ljava/lang/String; MethodParameters guardar D(Lcom/proyecto/PI09/model/Usuario;)Lcom/proyecto/PI09/model/Usuario;  % & ' save &(Ljava/lang/Object;)Ljava/lang/Object; ) com/proyecto/PI09/model/Usuario usuario !Lcom/proyecto/PI09/model/Usuario; validarLogin G(Ljava/lang/String;Ljava/lang/String;)Lcom/proyecto/PI09/model/Usuario;  / 0 1 findByCorreoAndPassword :(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Optional;
 3 5 4 java/util/Optional 6 ' orElse password registrarUsuario \(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; ; @cibertec.edu.pe
 = ? > java/lang/String @ A endsWith (Ljava/lang/String;)Z C CORREO_INVALIDO
 3 E F G 	isPresent ()Z I CORREO_EXISTENTE	  K 	 
 M USUARIO O Q P *com/proyecto/PI09/repository/RolRepository R  findByNombreRol
 3 T U G isEmpty W ROL_NO_EXISTE
 ( 
 ( Z [ \ 	setNombre (Ljava/lang/String;)V
 ( ^ _ \ setApellido
 ( a b \ 	setCorreo
 ( d e \ setPassword
 3 g h i get ()Ljava/lang/Object; k com/proyecto/PI09/model/Rol
 ( m n o setRol  (Lcom/proyecto/PI09/model/Rol;)V
 q s r java/lang/Boolean t u valueOf (Z)Ljava/lang/Boolean;
 ( w x y 	setEstado (Ljava/lang/Boolean;)V { OK nombre apellido rolOpt Ljava/util/Optional; LocalVariableTypeTable 3Ljava/util/Optional<Lcom/proyecto/PI09/model/Rol;>; StackMapTable 
SourceFile UsuarioService.java (Lorg/springframework/stereotype/Service; !                   	 
                  /     *· ±                                    ?     *´ +¹  °                               !        " #     B     *´ +¹ $ À (°                           * +  !    *    , -     Q     *´ +,¹ . ¶ 2À (°                                   7    !   	    7    8 9    G     ‚-Æ -:¶ <š B°*´ -¹  ¶ D™ H°*´ JL¹ N :¶ S™ V°» (Y· X:+¶ Y,¶ ]-¶ `¶ c¶ fÀ j¶ l¸ p¶ v*´ ¹ $ Wz°       B    #  $  '   ( # + 0 , 8 - ; 0 D 1 J 2 P 3 V 4 ] 5 j 6 s 8  9    H    ‚       ‚ |      ‚ }      ‚       ‚ 7    0 R ~   D > * +  €     0 R ~   ‚    ü  3 !    |   }      7    ƒ    „      …  

---


<ruta> .\target\classes\META-INF\MANIFEST.MF
---
Manifest-Version: 1.0
Build-Jdk-Spec: 25
Implementation-Title: grupo09
Implementation-Version: 0.0.1-SNAPSHOT
Created-By: Maven Integration for Eclipse



---


<ruta> .\target\classes\META-INF\maven\com.proyecto\grupo09\pom.properties
---
#Generated by Maven Integration for Eclipse
#Tue Apr 28 22:27:51 GMT-05:00 2026
artifactId=grupo09
groupId=com.proyecto
m2e.projectLocation=C\:\\Users\\juanj\\Downloads\\grupo09
m2e.projectName=grupo09
version=0.0.1-SNAPSHOT


---


<ruta> .\target\classes\META-INF\maven\com.proyecto\grupo09\pom.xml
---
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
	<modelVersion>4.0.0</modelVersion>
	<parent>
		<groupId>org.springframework.boot</groupId>
		<artifactId>spring-boot-starter-parent</artifactId>
		<version>3.4.5</version>
		<relativePath />
	</parent>
	<groupId>com.proyecto</groupId>
	<artifactId>grupo09</artifactId>
	<version>0.0.1-SNAPSHOT</version>
	<name>grupo09</name>
	<description />
	<properties>
		<java.version>17</java.version>
		<project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
		<project.reporting.outputEncoding>UTF-8</project.reporting.outputEncoding>
	</properties>
	<dependencies>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-data-jpa</artifactId>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-thymeleaf</artifactId>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-web</artifactId>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-devtools</artifactId>
			<scope>runtime</scope>
			<optional>true</optional>
		</dependency>

		<dependency>
			<groupId>org.postgresql</groupId>
			<artifactId>postgresql</artifactId>
			<scope>runtime</scope>
		</dependency>

		<dependency>
			<groupId>org.projectlombok</groupId>
			<artifactId>lombok</artifactId>
			<optional>true</optional>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-test</artifactId>
			<scope>test</scope>
		</dependency>
	</dependencies>

	<build>
		<plugins>
			<plugin>
				<groupId>org.springframework.boot</groupId>
				<artifactId>spring-boot-maven-plugin</artifactId>
				<configuration>
					<excludes>
						<exclude>
							<groupId>org.projectlombok</groupId>
							<artifactId>lombok</artifactId>
						</exclude>
					</excludes>
				</configuration>
			</plugin>
			<plugin>
				<groupId>org.apache.maven.plugins</groupId>
				<artifactId>maven-compiler-plugin</artifactId>
				<executions>
					<execution>
						<id>default-compile</id>
						<phase>compile</phase>
						<goals>
							<goal>compile</goal>
						</goals>
						<configuration>
							<annotationProcessorPaths>
								<path>
									<groupId>org.projectlombok</groupId>
									<artifactId>lombok</artifactId>
								</path>
							</annotationProcessorPaths>
						</configuration>
					</execution>
					<execution>
						<id>default-testCompile</id>
						<phase>test-compile</phase>
						<goals>
							<goal>testCompile</goal>
						</goals>
						<configuration>
							<annotationProcessorPaths>
								<path>
									<groupId>org.projectlombok</groupId>
									<artifactId>lombok</artifactId>
								</path>
							</annotationProcessorPaths>
						</configuration>
					</execution>
				</executions>
			</plugin>
		</plugins>
	</build>
</project>

---


<ruta> .\target\classes\static\css\watson-chatbot.css
---
:root {
    --watson-primary: #0f62fe;
    --watson-primary-hover: #0353e9;
    --watson-bg-light: #ffffff;
    --watson-bg-dark: #f4f4f4;
    --watson-text-primary: #161616;
    --watson-text-secondary: #525252;
    --watson-border: #e0e0e0;
    --watson-badge: #e81818;
    --watson-shadow: 0 4px 12px rgba(0, 0, 0, 0.12);
    --watson-shadow-lg: 0 8px 24px rgba(0, 0, 0, 0.15);
    --watson-radius: 8px;
    --watson-transition: all 0.3s cubic-bezier(0.2, 0, 0.38, 0.9);
}

#watson-container {
    position: fixed;
    bottom: 20px;
    right: 20px;
    z-index: 9999;
    font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, 'Helvetica Neue', Arial, sans-serif;
}

#watson-toggle {
    position: relative;
    width: 56px;
    height: 56px;
    border: none;
    border-radius: 50%;
    background: linear-gradient(135deg, var(--watson-primary) 0%, var(--watson-primary-hover) 100%);
    color: white;
    cursor: pointer;
    display: flex;
    align-items: center;
    justify-content: center;
    box-shadow: var(--watson-shadow-lg);
    transition: var(--watson-transition);
    padding: 0;
}

#watson-toggle:hover {
    transform: scale(1.1);
    box-shadow: 0 10px 32px rgba(15, 98, 254, 0.3);
}

#watson-toggle:active {
    transform: scale(0.95);
}

#watson-badge {
    position: absolute;
    top: -8px;
    right: -8px;
    background: var(--watson-badge);
    color: white;
    width: 24px;
    height: 24px;
    border-radius: 50%;
    font-size: 12px;
    font-weight: bold;
    display: none;
    align-items: center;
    justify-content: center;
    border: 2px solid white;
    animation: pulse 1.5s ease-in-out infinite;
}

@keyframes pulse {
    0%, 100% {
        transform: scale(1);
    }
    50% {
        transform: scale(1.15);
    }
}

#watson-panel {
    position: absolute;
    bottom: 80px;
    right: 0;
    width: 420px;
    height: 600px;
    background: var(--watson-bg-light);
    border-radius: var(--watson-radius);
    box-shadow: var(--watson-shadow-lg);
    border: 1px solid var(--watson-border);
    display: none;
    flex-direction: column;
    overflow: hidden;
    animation: slideIn 0.3s ease-out;
}

@keyframes slideIn {
    from {
        opacity: 0;
        transform: translateY(10px) scale(0.95);
    }
    to {
        opacity: 1;
        transform: translateY(0) scale(1);
    }
}

#watson-panel.active {
    display: flex;
}

.watson-loading {
    display: flex;
    align-items: center;
    justify-content: center;
    height: 100%;
    flex-direction: column;
    gap: 16px;
    color: var(--watson-text-secondary);
}

.watson-spinner {
    width: 40px;
    height: 40px;
    border: 4px solid var(--watson-bg-dark);
    border-top-color: var(--watson-primary);
    border-radius: 50%;
    animation: spin 0.8s linear infinite;
}

@keyframes spin {
    to { transform: rotate(360deg); }
}

.watson-loading-text {
    font-size: 14px;
    text-align: center;
}

@media (max-width: 600px) {
    #watson-container {
        bottom: 16px;
        right: 16px;
    }

    #watson-toggle {
        width: 48px;
        height: 48px;
    }

    #watson-panel {
        width: 100%;
        height: 100%;
        max-width: 100vw;
        max-height: 100vh;
        bottom: 0;
        right: 0;
        border-radius: 0;
        animation: slideInMobile 0.3s ease-out;
    }

    @keyframes slideInMobile {
        from {
            opacity: 0;
            transform: translateY(100%);
        }
        to {
            opacity: 1;
            transform: translateY(0);
        }
    }
}

#watson-toggle:focus-visible {
    outline: 2px solid var(--watson-primary);
    outline-offset: 2px;
}

@media (prefers-reduced-motion: reduce) {
    #watson-toggle,
    #watson-panel,
    #watson-badge {
        transition: none !important;
        animation: none !important;
    }

    #watson-toggle:hover {
        transform: none;
    }

    #watson-toggle:active {
        transform: none;
    }
}


---


<ruta> .\target\classes\static\js\watson-chatbot.js
---
class WatsonChatbot {
    constructor() {
        this.watsonUrl = null;
        this.isOpen = false;
        this.isLoaded = false;
        this.elements = {};
        this.init();
    }

    async init() {
        try {
            await this.loadWatsonUrl();

            this.cacheElements();

            this.attachEventListeners();

            console.log('[Watson] Chatbot inicializado correctamente');
        } catch (error) {
            console.error('[Watson] Error al inicializar:', error.message);
        }
    }

    async loadWatsonUrl() {
        try {
            const response = await fetch('/api/watson/config', {
                method: 'GET',
                headers: {
                    'Content-Type': 'application/json',
                    'X-Requested-With': 'XMLHttpRequest'
                }
            });

            if (response.ok) {
                const config = await response.json();
                this.watsonUrl = config.watsonUrl;
                this.applyCssVariables(config);
                console.log('[Watson] ConfiguraciÃ³n cargada desde backend');
            } else {
                throw new Error('No se pudo obtener la configuraciÃ³n del servidor');
            }
        } catch (error) {
            this.watsonUrl = this.getWatsonUrlFromMeta() || this.getWatsonUrlFromWindow();

            if (!this.watsonUrl) {
                throw new Error('No se encontrÃ³ la URL de Watson.');
            }
            console.log('[Watson] URL cargada desde configuraciÃ³n alternativa');
        }
    }

    applyCssVariables(config) {
        const root = document.documentElement;
        if (config.primary) root.style.setProperty('--watson-primary', config.primary);
        if (config.primaryHover) root.style.setProperty('--watson-primary-hover', config.primaryHover);
        if (config.bgLight) root.style.setProperty('--watson-bg-light', config.bgLight);
        if (config.bgDark) root.style.setProperty('--watson-bg-dark', config.bgDark);
        if (config.textPrimary) root.style.setProperty('--watson-text-primary', config.textPrimary);
        if (config.textSecondary) root.style.setProperty('--watson-text-secondary', config.textSecondary);
        if (config.border) root.style.setProperty('--watson-border', config.border);
        if (config.badge) root.style.setProperty('--watson-badge', config.badge);
    }

    getWatsonUrlFromMeta() {
        const meta = document.querySelector('meta[name="watson-url"]');
        return meta ? meta.getAttribute('content') : null;
    }

    getWatsonUrlFromWindow() {
        return window.WATSON_URL || window.IBM_WATSON_URL || null;
    }

    cacheElements() {
        this.elements = {
            container: document.getElementById('watson-container'),
            toggleBtn: document.getElementById('watson-toggle'),
            panel: document.getElementById('watson-panel'),
            badge: document.getElementById('watson-badge'),
            iconChat: document.getElementById('watson-icon-chat'),
            iconClose: document.getElementById('watson-icon-close')
        };

        if (!Object.values(this.elements).every(el => el)) {
            throw new Error('No se encontraron elementos del DOM requeridos');
        }
    }

    attachEventListeners() {
        this.elements.toggleBtn.addEventListener('click', () => this.toggle());

        document.addEventListener('keydown', (e) => {
            if (e.key === 'Escape' && this.isOpen) {
                this.close();
            }
        });

        document.addEventListener('click', (e) => {
            if (this.isOpen &&
                !this.elements.container.contains(e.target) &&
                !e.target.closest('[data-watson-ignore]')) {
            }
        });
    }

    toggle() {
        if (this.isOpen) {
            this.close();
        } else {
            this.open();
        }
    }

    open() {
        if (!this.watsonUrl) {
            console.error('[Watson] URL no configurada');
            return;
        }

        this.isOpen = true;

        this.elements.panel.classList.add('active');
        this.elements.toggleBtn.classList.add('active');

        if (!this.isLoaded) {
            this.loadWatson();
        }

        this.elements.panel.style.opacity = '0';
        setTimeout(() => {
            this.elements.panel.style.transition = 'opacity 0.3s ease-in';
            this.elements.panel.style.opacity = '1';
        }, 10);

        console.log('[Watson] Panel abierto');
    }

    close() {
        this.isOpen = false;

        this.elements.panel.style.opacity = '0';
        setTimeout(() => {
            this.elements.panel.classList.remove('active');
            this.elements.toggleBtn.classList.remove('active');
        }, 300);

        console.log('[Watson] Panel cerrado');
    }

    loadWatson() {
        if (this.isLoaded) return;

        this.showLoading();

        const script = document.createElement('script');
        script.src = this.watsonUrl;
        script.async = true;

        script.onload = () => {
            this.isLoaded = true;
            this.hideLoading();
            console.log('[Watson] Script cargado exitosamente');
        };

        script.onerror = () => {
            console.error('[Watson] Error al cargar el script');
            this.showError('Error al cargar el asistente. Por favor, intenta mÃ¡s tarde.');
        };

        document.body.appendChild(script);
    }

    showLoading() {
        const loading = document.createElement('div');
        loading.className = 'watson-loading';
        loading.id = 'watson-loading';
        loading.innerHTML = `
            <div class="watson-spinner"></div>
            <div class="watson-loading-text">Cargando asistente virtual...</div>
        `;
        this.elements.panel.innerHTML = '';
        this.elements.panel.appendChild(loading);
    }

    hideLoading() {
        const loading = document.getElementById('watson-loading');
        if (loading) {
            loading.remove();
        }
    }

    showError(message) {
        const error = document.createElement('div');
        error.className = 'watson-loading';
        error.innerHTML = `
            <svg style="width: 48px; height: 48px; color: #e81818;" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2">
                <circle cx="12" cy="12" r="10"></circle>
                <line x1="12" y1="8" x2="12" y2="12"></line>
                <line x1="12" y1="16" x2="12.01" y2="16"></line>
            </svg>
            <div class="watson-loading-text">${message}</div>
        `;
        this.elements.panel.innerHTML = '';
        this.elements.panel.appendChild(error);
    }

    showNotification(count = 1) {
        const badge = this.elements.badge;
        badge.textContent = count;
        badge.style.display = 'flex';
    }

    hideNotification() {
        this.elements.badge.style.display = 'none';
    }

    destroy() {
        this.elements.toggleBtn.removeEventListener('click', () => this.toggle());
        document.removeEventListener('keydown', (e) => {
            if (e.key === 'Escape') this.close();
        });
        this.isOpen = false;
        this.isLoaded = false;
    }
}

if (document.readyState === 'loading') {
    document.addEventListener('DOMContentLoaded', () => {
        window.watsonChatbot = new WatsonChatbot();
    });
} else {
    window.watsonChatbot = new WatsonChatbot();
}

if (typeof module !== 'undefined' && module.exports) {
    module.exports = WatsonChatbot;
}


---


<ruta> .\target\classes\templates\admin-alternativas.html
---
<!DOCTYPE html>
<html lang="es" xmlns:th="http://www.thymeleaf.org">

<head>
	<meta charset="UTF-8">
	<title>Alternativas</title>
	<style>
		* {
			box-sizing: border-box;
			font-family: Arial, sans-serif;
		}

		body {
			margin: 0;
			background: linear-gradient(135deg, #0f172a, #1e3a8a);
			min-height: 100vh;
			padding: 30px;
		}

		.container {
			max-width: 1100px;
			margin: 0 auto;
		}

		.box {
			background: white;
			border-radius: 16px;
			padding: 24px;
			box-shadow: 0 10px 30px rgba(0, 0, 0, 0.2);
			margin-bottom: 20px;
		}

		input,
		select {
			width: 100%;
			padding: 12px;
			margin-top: 6px;
			margin-bottom: 14px;
			border: 1px solid #ccc;
			border-radius: 10px;
		}

		.btn {
			display: inline-block;
			padding: 10px 16px;
			background: #2563eb;
			color: white;
			text-decoration: none;
			border: none;
			border-radius: 10px;
			font-weight: bold;
			cursor: pointer;
		}

		.btn:hover {
			background: #1d4ed8;
		}

		.btn-sec {
			display: inline-block;
			padding: 10px 16px;
			background: #6b7280;
			color: white;
			text-decoration: none;
			border: none;
			border-radius: 10px;
			font-weight: bold;
			cursor: pointer;
		}

		.btn-sec:hover {
			background: #4b5563;
		}

		table {
			width: 100%;
			border-collapse: collapse;
			margin-top: 14px;
		}

		th,
		td {
			padding: 12px;
			border-bottom: 1px solid #ddd;
			text-align: left;
		}

		th {
			background: #f3f4f6;
		}

		.link {
			color: #2563eb;
			text-decoration: none;
			font-weight: bold;
		}
	</style>
</head>

<body>
	<div class="container">
		<div class="box">
			<h1>Alternativas de la pregunta</h1>
			<p><strong th:text="${pregunta.texto}">Pregunta</strong></p>
			<a class="btn-sec"
				th:href="@{'/admin/simulacion/' + ${pregunta.simulacion.idSimulacion} + '/preguntas'}">Volver</a>
		</div>

		<div class="box">
			<h2>Nueva alternativa</h2>

			<form th:action="@{'/admin/pregunta/' + ${pregunta.idPregunta} + '/alternativas/guardar'}" method="post">
				<label>Texto de la alternativa</label>
				<input type="text" name="texto" required>

				<label>Puntaje</label>
				<input type="number" name="puntaje" required>

				<label>Siguiente pregunta</label>
				<select name="idSiguientePregunta">
					<option value="">-- Sin siguiente pregunta (termina flujo) --</option>
					<option th:each="p : ${preguntasSimulacion}" th:value="${p.idPregunta}" th:text="${p.texto}">
					</option>
				</select>

				<button class="btn" type="submit">Guardar alternativa</button>
			</form>
		</div>

		<div class="box">
			<h2>Alternativas registradas</h2>
			<table>
				<thead>
					<tr>
						<th>ID</th>
						<th>Texto</th>
						<th>Puntaje</th>
						<th>Siguiente pregunta</th>
						<th>Acciones</th>
					</tr>
				</thead>
				<tbody>
					<tr th:each="alt : ${alternativas}">
						<td th:text="${alt.idAlternativa}">1</td>
						<td th:text="${alt.texto}">Texto</td>
						<td th:text="${alt.puntaje}">0</td>
						<td th:if="${alt.siguientePregunta != null}" th:text="${alt.siguientePregunta.texto}">Siguiente
						</td>
						<td th:if="${alt.siguientePregunta == null}">Fin de simulaciÃ³n</td>
						<td>
							<a class="link"
								th:href="@{'/admin/alternativa/' + ${alt.idAlternativa} + '/editar'}">Editar</a>
							|
							<a class="link" th:href="@{'/admin/alternativa/' + ${alt.idAlternativa} + '/desactivar'}"
								onclick="return confirm('Â¿Deseas desactivar esta alternativa?');">
								Desactivar
							</a>
						</td>
					</tr>
				</tbody>
			</table>
		</div>
	</div>

	<div th:replace="~{fragments/watson-widget :: widget}"></div>

</body>

</html>

---


<ruta> .\target\classes\templates\admin-pregunta-form.html
---
<!DOCTYPE html>
<html lang="es" xmlns:th="http://www.thymeleaf.org">

<head>
	<meta charset="UTF-8">
	<title th:text="${modo == 'editar'} ? 'Editar pregunta' : 'Nueva pregunta'">Pregunta</title>
	<style>
		* {
			box-sizing: border-box;
			font-family: Arial, sans-serif;
		}

		body {
			margin: 0;
			background: linear-gradient(135deg, #0f172a, #1e3a8a);
			min-height: 100vh;
			display: flex;
			justify-content: center;
			align-items: center;
			padding: 24px;
		}

		.card {
			width: 100%;
			max-width: 600px;
			background: white;
			border-radius: 16px;
			padding: 28px;
			box-shadow: 0 10px 30px rgba(0, 0, 0, 0.2);
		}

		input[type="text"],
		input[type="number"] {
			width: 100%;
			padding: 12px;
			margin-top: 6px;
			margin-bottom: 16px;
			border: 1px solid #ccc;
			border-radius: 10px;
		}

		.btn,
		.btn-volver {
			width: 100%;
			padding: 12px;
			border: none;
			border-radius: 10px;
			font-weight: bold;
			cursor: pointer;
			text-align: center;
			display: block;
			text-decoration: none;
		}

		.btn {
			background: #2563eb;
			color: white;
		}

		.btn:hover {
			background: #1d4ed8;
		}

		.btn-volver {
			margin-top: 10px;
			background: #6b7280;
			color: white;
		}

		.btn-volver:hover {
			background: #4b5563;
		}
	</style>
</head>

<body>
	<div class="card">
		<h1 th:text="${modo == 'editar'} ? 'Editar pregunta' : 'Nueva pregunta'">Pregunta</h1>
		<p th:text="'SimulaciÃ³n: ' + ${simulacion.titulo}">SimulaciÃ³n</p>

		<form th:action="${modo == 'editar'} 
            ? @{'/admin/pregunta/' + ${pregunta.idPregunta} + '/actualizar'} 
            : @{'/admin/simulacion/' + ${simulacion.idSimulacion} + '/preguntas/guardar'}" method="post">

			<label>Texto de la pregunta</label>
			<input type="text" name="texto" th:value="${pregunta.texto}" required>

			<label>Orden</label>
			<input type="number" name="orden" th:value="${pregunta.orden != null ? pregunta.orden : 0}">

			<label>
				<input type="checkbox" name="esInicial" value="true" th:checked="${pregunta.esInicial}">
				Â¿Es pregunta inicial?
			</label>
			<br><br>

			<label>
				<input type="checkbox" name="esFinal" value="true" th:checked="${pregunta.esFinal}">
				Â¿Es pregunta final?
			</label>
			<br><br>

			<button class="btn" type="submit"
				th:text="${modo == 'editar'} ? 'Actualizar pregunta' : 'Guardar pregunta'">
				Guardar
			</button>
		</form>

		<a th:href="@{'/admin/simulacion/' + ${simulacion.idSimulacion} + '/preguntas'}" class="btn-volver">
			Volver
		</a>
	</div>

	<div th:replace="~{fragments/watson-widget :: widget}"></div>

</body>

</html>

---


<ruta> .\target\classes\templates\admin-preguntas.html
---
<!DOCTYPE html>
<html lang="es" xmlns:th="http://www.thymeleaf.org">

<head>
	<meta charset="UTF-8">
	<title>Preguntas</title>
	<style>
		* {
			box-sizing: border-box;
			font-family: Arial, sans-serif;
		}

		body {
			margin: 0;
			background: linear-gradient(135deg, #0f172a, #1e3a8a);
			min-height: 100vh;
			padding: 30px;
		}

		.container {
			max-width: 1100px;
			margin: 0 auto;
		}

		.box {
			background: white;
			border-radius: 16px;
			padding: 24px;
			box-shadow: 0 10px 30px rgba(0, 0, 0, 0.2);
			margin-bottom: 20px;
		}

		.btn {
			display: inline-block;
			padding: 10px 16px;
			background: #2563eb;
			color: white;
			text-decoration: none;
			border-radius: 10px;
			font-weight: bold;
		}

		.btn:hover {
			background: #1d4ed8;
		}

		table {
			width: 100%;
			border-collapse: collapse;
			margin-top: 14px;
		}

		th,
		td {
			padding: 12px;
			border-bottom: 1px solid #ddd;
			text-align: left;
		}

		th {
			background: #f3f4f6;
		}

		.link {
			color: #2563eb;
			text-decoration: none;
			font-weight: bold;
		}
	</style>
</head>

<body>
	<div class="container">
		<div class="box">
			<h1 th:text="'Preguntas de: ' + ${simulacion.titulo}">Preguntas</h1>
			<p th:text="${simulacion.descripcion}">DescripciÃ³n</p>
			<a class="btn" th:href="@{'/admin/simulacion/' + ${simulacion.idSimulacion} + '/preguntas/nueva'}">
				Nueva pregunta
			</a>
			<a class="btn" href="/admin/dashboard" style="margin-left:10px;">Volver</a>
		</div>

		<div class="box">
			<table>
				<thead>
					<tr>
						<th>ID</th>
						<th>Texto</th>
						<th>Orden</th>
						<th>Inicial</th>
						<th>Final</th>
						<th>Alternativas</th>
					</tr>
				</thead>
				<tbody>
					<tr th:each="preg : ${preguntas}">
						<td th:text="${preg.idPregunta}">1</td>
						<td th:text="${preg.texto}">Texto</td>
						<td th:text="${preg.orden}">1</td>
						<td th:text="${preg.esInicial} ? 'SÃ­' : 'No'">SÃ­</td>
						<td th:text="${preg.esFinal} ? 'SÃ­' : 'No'">No</td>
						<td>
							<a class="link" th:href="@{'/admin/pregunta/' + ${preg.idPregunta} + '/alternativas'}">
								Alternativas
							</a>
							|
							<a class="link" th:href="@{'/admin/pregunta/' + ${preg.idPregunta} + '/editar'}">
								Editar
							</a>
							|
							<a class="link" th:href="@{'/admin/pregunta/' + ${preg.idPregunta} + '/desactivar'}"
								onclick="return confirm('Â¿Deseas desactivar esta pregunta?');">
								Desactivar
							</a>
						</td>
					</tr>
				</tbody>
			</table>
		</div>
	</div>

	<link rel="stylesheet" href="/css/watson-chatbot.css">

	<div th:replace="~{fragments/watson-widget :: widget}"></div>
	
</body>

</html>

---


<ruta> .\target\classes\templates\dashboard.html
---
<!DOCTYPE html>
<html lang="es" xmlns:th="http://www.thymeleaf.org">

<head>
	<meta charset="UTF-8">
	<title>Dashboard Admin</title>
	<style>
		* {
			box-sizing: border-box;
			font-family: Arial, sans-serif;
		}

		body {
			margin: 0;
			background: linear-gradient(135deg, #0f172a, #1e3a8a);
			min-height: 100vh;
			padding: 30px;
		}

		.container {
			max-width: 1000px;
			margin: 0 auto;
		}

		.header,
		.card {
			background: white;
			border-radius: 16px;
			box-shadow: 0 10px 30px rgba(0, 0, 0, 0.2);
		}

		.header {
			padding: 24px;
			margin-bottom: 24px;
			text-align: center;
		}

		.header h1 {
			margin: 0 0 8px;
		}

		.grid {
			display: grid;
			gap: 20px;
		}

		.card {
			padding: 22px;
		}

		.btn {
			display: inline-block;
			margin-top: 12px;
			padding: 10px 16px;
			background: #2563eb;
			color: white;
			text-decoration: none;
			border-radius: 10px;
			font-weight: bold;
		}

		.btn:hover {
			background: #1d4ed8;
		}

		.top-link {
			display: inline-block;
			margin-top: 16px;
			color: white;
			text-decoration: none;
			font-weight: bold;
		}
	</style>
</head>

<body>
	<div class="container">
		<div class="header">
			<h1>Panel Administrador</h1>
			<p>GestiÃ³n de simulaciones, preguntas y alternativas</p>
		</div>

		<div class="grid">
			<div class="card" th:each="sim : ${simulaciones}">
				<h2 th:text="${sim.titulo}">TÃ­tulo</h2>
				<p th:text="${sim.descripcion}">DescripciÃ³n</p>
				<a class="btn" th:href="@{'/admin/simulacion/' + ${sim.idSimulacion} + '/preguntas'}">
					Gestionar preguntas
				</a>
			</div>
		</div>

		<a class="top-link" href="/logout">Cerrar sesiÃ³n</a>
	</div>

	<div th:replace="~{fragments/watson-widget :: widget}"></div>

</body>

</html>

---


<ruta> .\target\classes\templates\gracias.html
---
<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">

<head>
	<meta charset="UTF-8">
	<title>Â¡Gracias!</title>
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
	<style>
		body {
			background-color: #121212;
			color: #e0e0e0;
			height: 100vh;
			display: flex;
			align-items: center;
		}

		.card {
			background-color: #1e1e1e;
			border: none;
			width: 100%;
			max-width: 400px;
			margin: auto;
		}
	</style>
</head>

<body>
	<div class="card shadow p-4 text-center">
		<div class="mb-3" style="font-size: 3rem;">
			<svg xmlns="http://www.w3.org/2000/svg" fill="white" width="48" height="48" viewBox="0 0 24 24">
				<path d="M20.285 2l-11.285 11.567-5.286-5.011-3.714 3.716 9 8.728 15-15.285z" />
			</svg>
		</div>
		<h3 class="text-white mb-2">Â¡Gracias por tu respuesta!</h3>
		<p class="text-secondary">Tu opiniÃ³n nos ayuda a mejorar.</p>
		<a th:href="@{/preguntas}" class="btn btn-outline-light mt-3">Responder otra vez</a>
	</div>
	
	<div th:replace="~{fragments/watson-widget :: widget}"></div>
</body>

</html>

---


<ruta> .\target\classes\templates\login.html
---
<!DOCTYPE html>
<html lang="es" xmlns:th="http://www.thymeleaf.org">

<head>
	<meta charset="UTF-8">
	<title>Login</title>
	<style>
		* {
			box-sizing: border-box;
			font-family: Arial, sans-serif;
		}

		body {
			margin: 0;
			background: linear-gradient(135deg, #0f172a, #1e3a8a);
			min-height: 100vh;
			display: flex;
			justify-content: center;
			align-items: center;
		}

		.card {
			width: 100%;
			max-width: 420px;
			background: #ffffff;
			padding: 32px;
			border-radius: 16px;
			box-shadow: 0 10px 30px rgba(0, 0, 0, 0.25);
		}

		.title {
			margin: 0 0 8px;
			font-size: 32px;
			color: #111827;
			text-align: center;
		}

		.subtitle {
			margin: 0 0 24px;
			text-align: center;
			color: #6b7280;
			font-size: 14px;
		}

		.alert {
			padding: 12px 14px;
			border-radius: 10px;
			margin-bottom: 16px;
			font-size: 14px;
		}

		.alert-error {
			background: #fee2e2;
			color: #991b1b;
		}

		.alert-success {
			background: #dcfce7;
			color: #166534;
		}

		.form-group {
			margin-bottom: 18px;
		}

		label {
			display: block;
			margin-bottom: 8px;
			color: #374151;
			font-weight: bold;
			font-size: 14px;
		}

		input {
			width: 100%;
			padding: 12px;
			border: 1px solid #d1d5db;
			border-radius: 10px;
			font-size: 14px;
			outline: none;
		}

		input:focus {
			border-color: #2563eb;
			box-shadow: 0 0 0 3px rgba(37, 99, 235, 0.15);
		}

		.btn {
			width: 100%;
			padding: 12px;
			background: #2563eb;
			color: white;
			border: none;
			border-radius: 10px;
			font-size: 15px;
			font-weight: bold;
			cursor: pointer;
			transition: 0.2s ease;
		}

		.btn:hover {
			background: #1d4ed8;
		}

		.footer-link {
			text-align: center;
			margin-top: 18px;
			font-size: 14px;
		}

		.footer-link a {
			color: #2563eb;
			text-decoration: none;
			font-weight: bold;
		}

		.footer-link a:hover {
			text-decoration: underline;
		}
	</style>
</head>

<body>
	<div class="card">
		<h1 class="title">Iniciar sesiÃ³n</h1>
		<p class="subtitle">Accede al simulador de decisiones</p>

		<div th:if="${param.error}" class="alert alert-error">
			Correo o contraseÃ±a incorrectos.
		</div>

		<div th:if="${param.registroExitoso}" class="alert alert-success">
			Registro exitoso. Ahora puedes iniciar sesiÃ³n.
		</div>

		<form th:action="@{/login}" method="post">
			<div class="form-group">
				<label for="correo">Correo institucional</label>
				<input type="email" id="correo" name="correo" placeholder="usuario@cibertec.edu.pe" required>
			</div>

			<div class="form-group">
				<label for="password">ContraseÃ±a</label>
				<input type="password" id="password" name="password" placeholder="Ingresa tu contraseÃ±a" required>
			</div>

			<button type="submit" class="btn">Ingresar</button>
		</form>

		<div class="footer-link">
			Â¿No tienes cuenta? <a href="/registro">Crear cuenta</a>
		</div>
	</div>

	<div th:replace="~{fragments/watson-widget :: widget}"></div>

</body>

</html>

---


<ruta> .\target\classes\templates\pregunta.html
---
<!DOCTYPE html>
<html lang="es" xmlns:th="http://www.thymeleaf.org">

<head>
	<meta charset="UTF-8">
	<title>Pregunta</title>
	<style>
		* {
			box-sizing: border-box;
			font-family: Arial, sans-serif;
		}

		body {
			margin: 0;
			background: linear-gradient(135deg, #0f172a, #1e3a8a);
			min-height: 100vh;
			display: flex;
			justify-content: center;
			align-items: center;
			padding: 24px;
		}

		.card {
			width: 100%;
			max-width: 760px;
			background: white;
			border-radius: 18px;
			padding: 32px;
			box-shadow: 0 12px 35px rgba(0, 0, 0, 0.24);
		}

		.badge {
			display: inline-block;
			background: #eff6ff;
			color: #1d4ed8;
			padding: 10px 14px;
			border-radius: 999px;
			font-size: 14px;
			font-weight: bold;
			margin-bottom: 20px;
		}

		.question {
			font-size: 30px;
			color: #111827;
			margin: 0 0 24px;
			line-height: 1.3;
		}

		.options {
			display: flex;
			flex-direction: column;
			gap: 14px;
			margin-bottom: 24px;
		}

		.option {
			border: 1px solid #d1d5db;
			border-radius: 12px;
			padding: 16px;
			transition: 0.2s ease;
			cursor: pointer;
		}

		.option:hover {
			border-color: #2563eb;
			background: #f8fbff;
		}

		.option input {
			margin-right: 10px;
		}

		.option span {
			font-size: 16px;
			color: #1f2937;
		}

		.btn {
			width: 100%;
			padding: 14px;
			border: none;
			border-radius: 12px;
			background: #2563eb;
			color: white;
			font-size: 16px;
			font-weight: bold;
			cursor: pointer;
			transition: 0.2s ease;
		}

		.btn:hover {
			background: #1d4ed8;
		}
	</style>
</head>

<body>
	<div class="card">
		<div class="badge">
			Puntaje acumulado: <span th:text="${puntajeTotal}">0</span>
		</div>

		<h2 class="question" th:text="${pregunta.texto}">
			Texto de la pregunta
		</h2>

		<form th:action="@{/simulacion/responder}" method="post">
			<div class="options">
				<label class="option" th:each="alt : ${alternativas}">
					<input type="radio" name="idAlternativa" th:value="${alt.idAlternativa}" required>
					<span th:text="${alt.texto}">Texto de alternativa</span>
				</label>
			</div>

			<button type="submit" class="btn">Responder</button>
		</form>
	</div>

	<div th:replace="~{fragments/watson-widget :: widget}"></div>

</body>

</html>

---


<ruta> .\target\classes\templates\preguntas-publico.html
---
<!DOCTYPE html>
<html lang="es" xmlns:th="http://www.thymeleaf.org">

<head>
	<meta charset="UTF-8">
	<title>Simulaciones disponibles</title>
	<style>
		* {
			box-sizing: border-box;
			font-family: Arial, sans-serif;
		}

		body {
			margin: 0;
			background: linear-gradient(135deg, #0f172a, #1e3a8a);
			min-height: 100vh;
			padding: 40px 20px;
		}

		.container {
			max-width: 900px;
			margin: 0 auto;
		}

		.header {
			background: white;
			border-radius: 16px;
			padding: 28px;
			margin-bottom: 24px;
			box-shadow: 0 10px 30px rgba(0, 0, 0, 0.2);
			text-align: center;
		}

		.header h1 {
			margin: 0 0 8px;
			color: #111827;
			font-size: 34px;
		}

		.header p {
			margin: 0;
			color: #6b7280;
		}

		.alert {
			padding: 14px;
			border-radius: 10px;
			margin-bottom: 18px;
			font-size: 14px;
		}

		.alert-error {
			background: #fee2e2;
			color: #991b1b;
		}

		.grid {
			display: grid;
			grid-template-columns: repeat(auto-fit, minmax(300px, 1fr));
			gap: 20px;
		}

		.card {
			background: white;
			border-radius: 16px;
			padding: 24px;
			box-shadow: 0 10px 30px rgba(0, 0, 0, 0.18);
		}

		.card h3 {
			margin-top: 0;
			margin-bottom: 10px;
			color: #111827;
			font-size: 22px;
		}

		.card p {
			color: #4b5563;
			line-height: 1.5;
			min-height: 60px;
		}

		.btn {
			display: inline-block;
			margin-top: 12px;
			padding: 12px 18px;
			background: #2563eb;
			color: white;
			text-decoration: none;
			border-radius: 10px;
			font-weight: bold;
			transition: 0.2s ease;
		}

		.btn:hover {
			background: #1d4ed8;
		}

		.actions {
			margin-top: 24px;
			text-align: center;
		}

		.link-back {
			color: white;
			text-decoration: none;
			font-weight: bold;
		}

		.link-back:hover {
			text-decoration: underline;
		}
	</style>
</head>

<body>
	<div class="container">
		<div class="header">
			<h1>Simulaciones disponibles</h1>
			<p>Selecciona una simulaciÃ³n para iniciar el recorrido de decisiones</p>
		</div>

		<div th:if="${param.sinPreguntas}" class="alert alert-error">
			La simulaciÃ³n seleccionada no tiene una pregunta inicial configurada.
		</div>

		<div class="grid">
			<div class="card" th:each="sim : ${simulaciones}">
				<h3 th:text="${sim.titulo}">TÃ­tulo de simulaciÃ³n</h3>
				<p th:text="${sim.descripcion}">DescripciÃ³n de la simulaciÃ³n</p>
				<a class="btn" th:href="@{'/simulacion/' + ${sim.idSimulacion} + '/iniciar'}">
					Iniciar simulaciÃ³n
				</a>
			</div>
		</div>

		<div class="actions">
			<a class="link-back" href="/login">Volver al login</a>
		</div>
	</div>

	<div th:replace="~{fragments/watson-widget :: widget}"></div>
</body>

</html>

---


<ruta> .\target\classes\templates\registro.html
---
<!DOCTYPE html>
<html lang="es" xmlns:th="http://www.thymeleaf.org">

<head>
	<meta charset="UTF-8">
	<title>Registro</title>
	<style>
		* {
			box-sizing: border-box;
			font-family: Arial, sans-serif;
		}

		body {
			margin: 0;
			background: linear-gradient(135deg, #0f172a, #1e3a8a);
			min-height: 100vh;
			display: flex;
			justify-content: center;
			align-items: center;
			padding: 20px;
		}

		.card {
			width: 100%;
			max-width: 480px;
			background: #ffffff;
			padding: 32px;
			border-radius: 16px;
			box-shadow: 0 10px 30px rgba(0, 0, 0, 0.25);
		}

		.title {
			margin: 0 0 8px;
			font-size: 30px;
			color: #111827;
			text-align: center;
		}

		.subtitle {
			margin: 0 0 24px;
			text-align: center;
			color: #6b7280;
			font-size: 14px;
		}

		.alert {
			padding: 12px 14px;
			border-radius: 10px;
			margin-bottom: 16px;
			font-size: 14px;
		}

		.alert-error {
			background: #fee2e2;
			color: #991b1b;
		}

		.form-group {
			margin-bottom: 18px;
		}

		label {
			display: block;
			margin-bottom: 8px;
			color: #374151;
			font-weight: bold;
			font-size: 14px;
		}

		input {
			width: 100%;
			padding: 12px;
			border: 1px solid #d1d5db;
			border-radius: 10px;
			font-size: 14px;
			outline: none;
		}

		input:focus {
			border-color: #2563eb;
			box-shadow: 0 0 0 3px rgba(37, 99, 235, 0.15);
		}

		.help {
			margin-top: 6px;
			color: #6b7280;
			font-size: 12px;
		}

		.btn {
			width: 100%;
			padding: 12px;
			background: #2563eb;
			color: white;
			border: none;
			border-radius: 10px;
			font-size: 15px;
			font-weight: bold;
			cursor: pointer;
			transition: 0.2s ease;
		}

		.btn:hover {
			background: #1d4ed8;
		}

		.footer-link {
			text-align: center;
			margin-top: 18px;
			font-size: 14px;
		}

		.footer-link a {
			color: #2563eb;
			text-decoration: none;
			font-weight: bold;
		}

		.footer-link a:hover {
			text-decoration: underline;
		}
	</style>
</head>

<body>
	<div class="card">
		<h1 class="title">Registro de usuario</h1>
		<p class="subtitle">Crea tu cuenta para acceder al simulador</p>

		<div th:if="${param.errorCorreo}" class="alert alert-error">
			Solo se permiten correos institucionales de Cibertec.
		</div>

		<div th:if="${param.correoExiste}" class="alert alert-error">
			Ese correo ya estÃ¡ registrado.
		</div>

		<div th:if="${param.errorRol}" class="alert alert-error">
			No se encontrÃ³ el rol USUARIO en la base de datos.
		</div>

		<form th:action="@{/registro}" method="post">
			<div class="form-group">
				<label for="nombre">Nombre</label>
				<input type="text" id="nombre" name="nombre" placeholder="Ingresa tu nombre" required>
			</div>

			<div class="form-group">
				<label for="apellido">Apellido</label>
				<input type="text" id="apellido" name="apellido" placeholder="Ingresa tu apellido" required>
			</div>

			<div class="form-group">
				<label for="correo">Correo institucional</label>
				<input type="email" id="correo" name="correo" placeholder="usuario@cibertec.edu.pe" required>
				<div class="help">Solo se aceptan correos con dominio @cibertec.edu.pe</div>
			</div>

			<div class="form-group">
				<label for="password">ContraseÃ±a</label>
				<input type="password" id="password" name="password" placeholder="Crea una contraseÃ±a" required>
			</div>

			<button type="submit" class="btn">Registrarse</button>
		</form>

		<div class="footer-link">
			Â¿Ya tienes cuenta? <a href="/login">Iniciar sesiÃ³n</a>
		</div>
	</div>

	<div th:replace="~{fragments/watson-widget :: widget}"></div>
</body>

</html>

---


<ruta> .\target\classes\templates\resultado.html
---
<!DOCTYPE html>
<html lang="es" xmlns:th="http://www.thymeleaf.org">

<head>
	<meta charset="UTF-8">
	<title>Resultado</title>
	<style>
		* {
			box-sizing: border-box;
			font-family: Arial, sans-serif;
		}

		body {
			margin: 0;
			background: linear-gradient(135deg, #0f172a, #1e3a8a);
			min-height: 100vh;
			display: flex;
			justify-content: center;
			align-items: center;
			padding: 24px;
		}

		.card {
			width: 100%;
			max-width: 700px;
			background: white;
			border-radius: 18px;
			padding: 36px;
			box-shadow: 0 12px 35px rgba(0, 0, 0, 0.24);
			text-align: center;
		}

		.title {
			margin: 0 0 16px;
			color: #111827;
			font-size: 34px;
		}

		.score-box {
			background: #eff6ff;
			color: #1d4ed8;
			padding: 18px;
			border-radius: 14px;
			margin: 20px 0;
		}

		.score-box p {
			margin: 0;
			font-size: 18px;
		}

		.score-box strong {
			font-size: 34px;
			display: block;
			margin-top: 6px;
		}

		.message {
			margin: 22px 0 28px;
			font-size: 18px;
			color: #374151;
			line-height: 1.6;
		}

		.btn {
			display: inline-block;
			padding: 14px 20px;
			background: #2563eb;
			color: white;
			text-decoration: none;
			border-radius: 12px;
			font-weight: bold;
			transition: 0.2s ease;
		}

		.btn:hover {
			background: #1d4ed8;
		}
	</style>
</head>

<body>
	<div class="card">
		<h1 class="title">Resultado final de la simulaciÃ³n</h1>

		<div class="score-box">
			<p>Puntaje total obtenido</p>
			<strong th:text="${puntajeTotal}">0</strong>
		</div>

		<p class="message" th:text="${mensaje}">
			Mensaje final
		</p>

		<a class="btn" href="/simulacion">Volver a simulaciones</a>
	</div>

	<div th:replace="~{fragments/watson-widget :: widget}"></div>

</body>

</html>

---


<ruta> .\target\classes\templates\fragments\watson-widget.html
---
<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">

<body>

	<th:block th:fragment="widget">
		<link rel="stylesheet" href="/css/watson-chatbot.css">

		<div id="watson-container">
			<button id="watson-toggle">
				<svg width="24" height="24" viewBox="0 0 24 24" fill="currentColor">
					<path
						d="M12 2C6.48 2 2 6.48 2 12s4.48 10 10 10 10-4.48 10-10S17.52 2 12 2zm0 18c-4.41 0-8-3.59-8-8s3.59-8 8-8 8 3.59 8 8-3.59 8-8 8zm3.5-9c.83 0 1.5-.67 1.5-1.5S16.33 8 15.5 8 14 8.67 14 9.5s.67 1.5 1.5 1.5zm-7 0c.83 0 1.5-.67 1.5-1.5S9.33 8 8.5 8 7 8.67 7 9.5 7.67 11 8.5 11zm3.5 6.5c2.33 0 4.31-1.46 5.11-3.5H6.89c.8 2.04 2.78 3.5 5.11 3.5z" />
				</svg>
				<div id="watson-badge">1</div>
			</button>
			<div id="watson-panel"></div>
		</div>

		<script src="/js/watson-chatbot.js"></script>
	</th:block>

</body>

</html>

---


<ruta> .\target\test-classes\com\proyecto\PI09\Grupo09ApplicationTests.class
---
Êþº¾   =   )com/proyecto/PI09/Grupo09ApplicationTests  java/lang/Object <init> ()V Code
  	   LineNumberTable LocalVariableTable this +Lcom/proyecto/PI09/Grupo09ApplicationTests; contextLoads RuntimeVisibleAnnotations Lorg/junit/jupiter/api/Test; 
SourceFile Grupo09ApplicationTests.java 6Lorg/springframework/boot/test/context/SpringBootTest;                  /     *· ±    
                                    +      ±    
                                 

---

