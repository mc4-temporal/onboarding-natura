import {saveAs} from 'file-saver';

class FileUtil {
  downloadTextAsFile(content: string, fileName: string) {
    const blob = new Blob([content], {
      type: 'text/plain;charset=utf-8'
    });
    saveAs(blob, fileName);
  }

  fileToBase64(file: File): Promise<string> {
    return new Promise((resolve, reject) => {
      const reader = new FileReader();
      reader.readAsDataURL(file);
      reader.onload = () => resolve(`${reader.result}`);
      reader.onerror = () => reject('Error al leer el archivo');
    });
  }

  async fileToByteArray(file: File): Promise<number[]> {
    return Array.from(new Uint8Array(await file.arrayBuffer()));
  }
}

export const fileUtil = new FileUtil();
