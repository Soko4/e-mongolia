<!DOCTYPE html>
<html lang="mn">
<head>
  <meta charset="UTF-8">
  <title>eMongolia - Бичиг баримт</title>
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <script src="https://cdn.tailwindcss.com"></script>
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.0/css/all.min.css">
</head>
<body class="bg-gray-100 font-sans text-[15px] sm:text-base">

  <!-- Дээд цэс -->
  <header class="bg-blue-700 text-white text-sm">
    <div class="max-w-md mx-auto flex flex-col sm:flex-row sm:justify-between items-center p-2 gap-1">
      <div class="flex space-x-4 justify-center">
        <a href="#" class="font-semibold hover:underline">Иргэн</a>
        <a href="#" class="opacity-80 hover:opacity-100 hover:underline">Хуулийн этгээд</a>
        <a href="#" class="opacity-80 hover:opacity-100 hover:underline">Гадаад хүн</a>
      </div>
    </div>
  </header>

  <!-- eMongolia logo хэсэг -->
  <div class="bg-white shadow-sm">
    <div class="max-w-md mx-auto flex items-center justify-between py-3 px-4">
      <div class="flex items-center space-x-2">
        <img src="logo1.jpg" alt="eMongolia Logo" class="w-10 h-10 object-contain">
        <span class="text-xl font-bold text-gray-800">mongolia</span>
      </div>
    
    <!-- Гурван зураас -->
    <button class="flex flex-col justify-center items-center space-y-1 sm:hidden">
      <span class="block w-6 h-0.5 bg-gray-800"></span>
      <span class="block w-6 h-0.5 bg-gray-800"></span>
      <span class="block w-6 h-0.5 bg-gray-800"></span>
    </button>
  </div>
</div>

  <!-- Бичиг баримт хэсэг -->
  <div class="max-w-md mx-auto mt-4 bg-[#f0f8ff] p-4 rounded-lg shadow-md">
    <div class="text-xs text-blue-600 mb-1">Профайл &gt; Бичиг баримт</div>
    <h1 class="text-xl font-bold text-blue-900 mb-4">Бичиг баримт</h1>

    <!-- Profile зураг -->
    <div class="flex justify-center mb-4">
      <img src="zurag.jpg" alt="Profile" class="w-24 h-24 rounded-full border-4 border-blue-500">
    </div>

    <!-- Үндсэн мэдээлэл -->
    <div class="text-sm space-y-2 text-gray-800 bg-white border border-white rounded p-3 shadow-sm">
      <p class="font-medium text-gray-700">Үндсэн мэдээлэл</p>
      <p><span class="text-gray-400">Ургийн овог:</span><br><span class="text-blue-900 font-semibold">Боржигин</span></p>
      <p><span class="text-gray-400">Овог:</span><br><span class="text-blue-900 font-semibold">Содгэрэл</span></p>
      <p><span class="text-gray-400">Нэр:</span><br><span class="text-blue-900 font-bold uppercase">Итгэл</span></p>
      <p><span class="text-gray-400">Яс үндэс:</span><br><span class="text-blue-900 font-semibold">Халх</span></p>
      <p><span class="text-gray-400">Хүйс:</span><br><span class="text-blue-900 font-semibold">Эрэгтэй</span></p>
      <p><span class="text-gray-400">Бүртгэлийн дугаар:</span><br><span class="text-blue-900 font-semibold">мз03260216</span></p>
      <p class="font-medium text-gray-700">Иргэний үнэмлэхийн хаяг</p>
      <p class="text-blue-900 font-semibold">Сэлэнгэ, Мандал сум, 7-р баг, Минжийнхангай дууш гудамж, 37 тоот</p>
      <p class="font-medium text-gray-700">Оршин суугаа хаяг</p>
    </div>

    <!-- Миний үнэмлэх + шинэчлэх -->
    <div class="flex items-center justify-between mt-6">
      <h3 class="text-sm font-bold text-gray-800">МИНИЙ ҮНЭМЛЭХ</h3>
      <a href="#" class="text-blue-600 text-sm flex items-center gap-1 hover:underline">
        Шинэчлэх
        <svg class="w-4 h-4" fill="none" stroke="currentColor" stroke-width="2" viewBox="0 0 24 24">
          <path stroke-linecap="round" stroke-linejoin="round" d="M4 4v5h.582m15.364 1A9 9 0 116.582 9"></path>
        </svg>
      </a>
    </div>
    

    <!-- Иргэний үнэмлэхний зураг -->
    <div class="mt-4 flex justify-center">
      <img src="unelemekh.jpg" alt="Иргэний үнэмлэх" class="w-full max-w-xs rounded-md border border-gray-300 shadow-sm">
    </div>

    <!-- Өрхийн гишүүдийн мэдээлэл -->
    <div class="bg-white rounded-lg p-4 mt-4 shadow-sm text-sm text-gray-800">
      <div class="flex items-center gap-2 mb-2">
        <span>👨‍👩‍👧‍👦</span>
        <h4 class="font-semibold">Өрхийн гишүүдийн мэдээлэл</h4>
      </div>
      <p>Ам бүлийн тоо: <span class="text-blue-700 font-medium">4</span></p>
      <ul class="list-disc list-inside mt-2 text-blue-800 space-y-1">
        <li>ДУЛАМСҮРЭН СОДГЭРЭЛ</li>
        <li>ДОЛЖИНЖАВ ПҮРЭВДУЛАМ</li>
        <li>СОДГЭРЭЛ МИШЭЭЛ</li>
        <li>СОДГЭРЭЛ ИТГЭЛ</li>
      </ul>
    </div>
    <!-- Тээврийн хэрэгсэл -->
<div class="max-w-md mx-auto mt-4 bg-white rounded-lg shadow p-4">
  <div class="flex items-center gap-2 mb-2">
    <span>🚗</span>
    <h2 class="font-semibold text-gray-800">Тээврийн хэрэгсэл</h2>
  </div>
  <div class="bg-blue-100 border-l-4 border-blue-400 text-blue-800 p-3 rounded text-sm">
    <p>ℹ️ Таны нэр дээр тээврийн хэрэгсэл бүртгэгдээгүй байна.</p>
  </div>
</div>

<!-- Хуулийн этгээдийн мэдээлэл -->
<div class="max-w-md mx-auto mt-4 bg-white rounded-lg shadow p-4">
  <div class="flex items-center gap-2 mb-2">
    <span>🏢</span>
    <h2 class="font-semibold text-gray-800">Хуулийн этгээдийн мэдээлэл</h2>
  </div>
  <div class="bg-blue-100 border-l-4 border-blue-400 text-blue-800 p-3 rounded text-sm">
    <p>ℹ️ Таны нэр дээр компани бүртгэгдээгүй байна.</p>
  </div>
</div>

<!-- Үл хөдлөх хөрөнгө -->
<div class="max-w-md mx-auto mt-4 bg-white rounded-lg shadow p-4">
  <div class="flex items-center gap-2 mb-2">
    <span>🏬</span>
    <h2 class="font-semibold text-gray-800">Үл хөдлөх хөрөнгө</h2>
  </div>
  <div class="text-sm text-gray-800 leading-relaxed">
    <p><a href="#" class="text-blue-600 font-semibold hover:underline">Газар (Г1307007719)</a></p>
    <p>Төв Эрдэнэ сум 1-р баг, 91-9133 тоот</p>
  </div>
</div>

<!-- Яаралтай тусламжийн дугаарууд -->
<div class="bg-gray-900 text-white py-4 mt-6">
  <div class="max-w-md mx-auto text-center">
    <h3 class="font-semibold mb-3">Яаралтай тусламжийн дугаарууд</h3>
    <div class="flex justify-around text-blue-400 font-bold text-lg">
      <div>
        <p class="text-sm text-white">Гал түймэр</p>
        <p>101</p>
      </div>
      <div>
        <p class="text-sm text-white">Гэмт хэрэг</p>
        <p>102</p>
      </div>
      <div>
        <p class="text-sm text-white">хүний эрүүл мэнд</p>
        <p>103</p>
      </div>
    </div>
  </div>
</div>
<!-- e-Mongolia app сурталчилгаа -->
<div class="bg-gray-900 text-white py-6">
  <div class="max-w-md mx-auto text-center">
    <h3 class="text-lg font-semibold mb-2">e-Mongolia аппаа татаарай</h3>
    <div class="flex justify-center gap-4 mb-4">
      <a href="https://apps.apple.com" target="_blank">
        <img src="https://developer.apple.com/assets/elements/badges/download-on-the-app-store.svg" alt="App Store" class="h-10">
      </a>
      <a href="https://play.google.com/store" target="_blank">
        <img src="https://upload.wikimedia.org/wikipedia/commons/7/78/Google_Play_Store_badge_EN.svg" alt="Google Play" class="h-10">
      </a>
    </div>
  </div>

  <div class="max-w-md mx-auto">
    <div class="flex items-center gap-2 mb-2">
      <span>📋</span>
      <h2 class="text-lg font-semibold text-white">Үйлчилгээний ангилал</h2>
    </div>
    <ul class="text-sm text-white space-y-1 pl-6" style="list-style-type: none;">
      <li>Эрүүл мэнд</li>
      <li>Лавлагаа, тодорхойлолт</li>
      <li>Бичиг баримт захиалга, үйлчилгээ</li>
      <li>Нийтлэг хэрэглээ</li>
      <li>Газар, үл хөдлөх эд хөрөнгө</li>
      <li>Зөвшөөрөл, тодорхойлолт, акт</li>
      <li>Бүртгэл, шилжилт хөдөлгөөн</li>
      <li>Аюулгүй байдал, батлан хамгаалах</li>
      <li>Хөдөлмөр эрхлэлт, нийгмийн хамгаалал</li>
      <li>Нийслэл, аймаг</li>
      <li>Яам</li>
    </ul>

    <h2 class="text-lg font-semibold text-white mt-4 mb-1 pl-5">Бусад</h2>
    <ul class="text-sm text-white space-y-1 pl-6" style="list-style-type: none;">
      <li>Цахим ур чадвар <span class="text-blue-600 font-semibold">ХУРДАН цэгүүд</span></li>
      <li>Оюутан цэс</li>
      <li>Чингис хааны иш хэрэг</li>
      <li>UB газрын зураг</li>
      <li>ЦЕГ-т хандах</li>
      <li>АТГ-т хандах</li>
    </ul>
  </div>
  <!-- Footer -->
<footer class="bg-gray-900 text-white py-4">
  <div class="flex justify-center space-x-6 mb-2">
    <a href="#" target="_blank" aria-label="Facebook">
      <i class="fab fa-facebook-f text-xl"></i>
    </a>
    <a href="#" target="_blank" aria-label="Twitter">
      <i class="fab fa-twitter text-xl"></i>
    </a>
    <a href="#" target="_blank" aria-label="Instagram">
      <i class="fab fa-instagram text-xl"></i>
    </a>
    <a href="#" target="_blank" aria-label="YouTube">
      <i class="fab fa-youtube text-xl"></i>
    </a>
  </div>
  <p class="text-center text-sm">© Бүх эрх хуулиар хамгаалагдсан 2024 он.</p>
</footer>
</div>
</div>

  </div>
</body>
</html>