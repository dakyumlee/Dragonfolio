#!/bin/bash

echo "🐉 Dragonfolio - 슬리데린의 비밀과 투슬리스의 숨결"
echo "========================================="

echo "🚀 백엔드 서버 시작 중..."
cd backend

# Gradle 빌드 및 실행
if command -v gradle &> /dev/null; then
    gradle clean bootRun
else
    echo "❌ Gradle이 설치되지 않았습니다."
    echo "Homebrew로 설치: brew install gradle"
    echo "또는 SDKMAN으로 설치: sdk install gradle"
    echo ""
    echo "🎯 임시 해결책: Java로 직접 실행"
    echo "먼저 다음 명령어로 빌드하세요:"
    echo "gradle build"
    echo "java -jar build/libs/dragonfolio-0.0.1-SNAPSHOT.jar"
fi
