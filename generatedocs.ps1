# Description:
# This script generates Javadoc for the Java project and places the output in the 'docs' directory.

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
$docsDir = Join-Path $projectRoot "docs"

# Ensure the docs directory exists
if (-Not (Test-Path -Path $docsDir)) {
    Write-Green "Creating docs directory at $docsDir"
    New-Item -ItemType Directory -Path $docsDir | Out-Null
} else {
    Write-Green "Docs directory already exists at $docsDir"
}

# Generate Javadoc
Write-Green "Generating Javadoc..."

# Build the javadoc command
$javadocArgs = @(
    "-d", "`"$docsDir`"",          # Output directory
    "-sourcepath", "`"$srcDir`"", # Source directory
    "-subpackages", "com.ambiguousdino", # Packages to include
    "-author", "-version"          # Optional flags for author and version
)

# Execute the javadoc command
$javadocCommand = "javadoc " + ($javadocArgs -join ' ')
Write-Green "Executing: $javadocCommand"

$javadocResult = & javadoc @javadocArgs 2>&1

if ($LASTEXITCODE -ne 0) {
    Write-Red "Javadoc generation failed with the following errors:"
    Write-Host $javadocResult -ForegroundColor Red
    exit 1
} else {
    Write-Green "Javadoc successfully generated in the 'docs' directory."
}