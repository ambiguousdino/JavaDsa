# Description:
# This script compiles the Java project located in the src/main/java directory
# and outputs the compiled classes to the bin directory.

# Function to display messages in green
function Write-Green {
    param([string]$Message)
    Write-Host $Message -ForegroundColor Green
}

# Function to display error messages in red
function Write-Red {
    param([string]$Message)
    Write-Host $Message -ForegroundColor Red
}

# Define project directories
$projectRoot = Get-Location
$srcDir = Join-Path $projectRoot "src\main\java"
$binDir = Join-Path $projectRoot "bin"

# Ensure bin directory exists
if (-Not (Test-Path -Path $binDir)) {
    Write-Green "Creating bin directory at $binDir"
    New-Item -ItemType Directory -Path $binDir | Out-Null
} else {
    Write-Green "Bin directory already exists at $binDir"
}

# Compile Java files
Write-Green "Compiling Java project..."

# Find all .java files in srcDir
$javaFiles = Get-ChildItem -Path $srcDir -Recurse -Filter *.java

if ($javaFiles.Count -eq 0) {
    Write-Red "No Java files found in $srcDir. Exiting script."
    exit 1
}

# Build the javac command
# -d specifies the destination for compiled classes
# -sourcepath specifies the location of source files
$javacArgs = @("-d", "`"$binDir`"", "-sourcepath", "`"$srcDir`"")

foreach ($file in $javaFiles) {
    $javacArgs += "`"$($file.FullName)`""
}

# Execute the javac command
$javacCommand = "javac " + ($javacArgs -join ' ')
Write-Green "Executing: $javacCommand"

# Run the javac command
$compileResult = & javac @javacArgs 2>&1

if ($LASTEXITCODE -ne 0) {
    Write-Red "Compilation failed with the following errors:"
    Write-Host $compileResult -ForegroundColor Red
    exit 1
} else {
    Write-Green "Compilation successful!"
}

# Run the DsaApp runner
$mainClass = "com.ambiguousdino.app.DsaApp"
Write-Green "Running the runner: $mainClass"

# Execute the java command
$runCommand = "java -cp `"$binDir`" $mainClass"
Write-Green "Executing: $runCommand"

$runResult = & java -cp $binDir $mainClass 2>&1

if ($LASTEXITCODE -ne 0) {
    Write-Red "Runner encountered an error:"
    Write-Host $runResult -ForegroundColor Red
    exit 1
} else {
    Write-Green "Runner executed successfully!"
    Write-Host $runResult
}